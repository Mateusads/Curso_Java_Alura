package br.com.mateus.medeiros.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {

	private ServerSocket servidor;
	private ExecutorService threadPool;
	private AtomicBoolean estaRodando;

	// construtor
	public ServidorTarefas() throws IOException {
		System.out.println("---- Iniciando Servidor ----");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newFixedThreadPool(4, new FabricaDeThreads());
		this.estaRodando = new AtomicBoolean(true);
	}

	public void rodar() throws IOException {

		while (this.estaRodando.get()) {

			try {
				Socket socket = this.servidor.accept();
				System.out.println("Aceitando novo cliente na porta " + socket.getPort());

				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool, socket, this);

				this.threadPool.submit(distribuirTarefas); 
			} catch (SocketException e) {
				System.out.println("SocketException, está rodando? " + this.estaRodando);
			}
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