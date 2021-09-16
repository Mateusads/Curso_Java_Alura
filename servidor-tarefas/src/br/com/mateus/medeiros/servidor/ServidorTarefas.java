package br.com.mateus.medeiros.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ServidorTarefas {

	private ServerSocket servidor;
	private ExecutorService threadPool;
	private AtomicBoolean estaRodando;
	private BlockingQueue<String> filaCliente;
	private AtomicInteger atomicCliente;

	// construtor
	public ServidorTarefas() throws IOException {
		System.out.println("---- Iniciando Servidor ----");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newFixedThreadPool(100, new FabricaDeThreads());
		this.estaRodando = new AtomicBoolean(true);
		this.filaCliente = new ArrayBlockingQueue<>(999);
		atomicCliente = new AtomicInteger();


	}

	public void rodar() throws IOException {

		while (this.estaRodando.get()) {

			try {
				Socket socket = this.servidor.accept();
				System.out.println("Aceitando novo cliente na porta " + socket.getPort());

				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool, filaCliente, socket, this);

				this.threadPool.submit(distribuirTarefas);
			} catch (SocketException e) {
				System.out.println("SocketException, está rodando? " + this.estaRodando);
			}
		}
	}

	public void inicializarConsumidores() {
		int c = atomicCliente.get();
		c += 1;
		atomicCliente.set(c);
		System.out.println("chamado-numero: " + c);
		for(int i = 0; i <= c ; i++) {	
				TarefaConsumir tarefa = new TarefaConsumir(filaCliente);
				this.threadPool.execute(tarefa);
			}

		}

	

	public void parar() throws IOException {
		System.out.println("Parando servidor");
		this.estaRodando.set(false);
		this.threadPool.shutdown();
		this.servidor.close();
	}

	public static void main(String[] args) throws Exception {
		ServidorTarefas servidor = new ServidorTarefas();
		servidor.rodar(); // o servidor roda enquanto estaRodando = true
	}
}