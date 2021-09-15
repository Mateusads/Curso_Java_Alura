package br.com.mateus.medeiros.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class DistribuirTarefas implements Runnable {

	private Socket socket;
	private ServidorTarefas servidorTarefas;
	private ExecutorService threadPool;

	public DistribuirTarefas(ExecutorService threadPool, Socket socket, ServidorTarefas servidorTarefas) {
		this.threadPool = threadPool;
		this.socket = socket;
		this.servidorTarefas = servidorTarefas;
	}

	@Override
	public void run() {

		try {
			System.out.println("Distribuindo as tarefas para o cliente " + socket);

			Scanner entradaCliente = new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

			while (entradaCliente.hasNextLine()) {

				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido " + comando);


		        switch (comando) {
	            case "c1": {
	                saidaCliente.println("Confirmação do comando c1");
	                this.threadPool.execute(new ComandoC1(saidaCliente));
	                break;
	            }
	            case "c2": {
	                saidaCliente.println("Confirmação do comando c2");
	                this.threadPool.execute(new ComandoC2(saidaCliente));
	                break;
	            }
				case "fim": {
				    saidaCliente.println("Desligando o servidor");
				    servidorTarefas.parar();
				    
				    break;
				}
				default: {
					saidaCliente.println("Comando não encontrado");
				}
				}

				System.out.println(comando);
			}

			saidaCliente.close();
			entradaCliente.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}