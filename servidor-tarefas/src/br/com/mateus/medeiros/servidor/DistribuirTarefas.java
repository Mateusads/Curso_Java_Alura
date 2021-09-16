package br.com.mateus.medeiros.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

	private Socket socket;
	private ServidorTarefas servidorTarefas;
	private ExecutorService threadPool;
	private BlockingQueue<String> filaCliente;


	public DistribuirTarefas(ExecutorService threadPool, 
			BlockingQueue<String> filaCliente, Socket socket, 
			ServidorTarefas servidorTarefas) {
		this.threadPool = threadPool;
		this.filaCliente = filaCliente;
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
	                Future<String> futureBanco = threadPool.submit(new ComandoC2AcessaBanco(saidaCliente));
	                Future<String> futureWS = threadPool.submit(new ComandoC2ChamaWs(saidaCliente));
	                this.threadPool.submit(new JuntaResultadosFutureWSFutureBanco(futureWS, futureBanco, saidaCliente));	                
	                break;
	            }
	            case "c3": {
	                saidaCliente.println("Confirmação do comando c3");
	                saidaCliente.println("Qual seu nome?");	
	            	String comandoC3 = entradaCliente.nextLine();
	                this.filaCliente.put(comandoC3);
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