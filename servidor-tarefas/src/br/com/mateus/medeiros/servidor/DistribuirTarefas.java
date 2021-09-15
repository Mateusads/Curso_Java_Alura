package br.com.mateus.medeiros.servidor;

import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

	private Socket socket;

	public DistribuirTarefas(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("Distribuindo as tarefas para o cliente " + socket);

		try {
			// passando o InputStream do cliente no construtor
			Scanner entradaCliente = new Scanner(socket.getInputStream());

			while (entradaCliente.hasNextLine()) {
			    String comando = entradaCliente.nextLine();
			     System.out.println(comando + ": O PI 16 em dígitos é (3,1415926535897932");
			}

			entradaCliente.close(); // fechando o scanner

		} catch (Exception e) {
			// aqui vem mais
			throw new RuntimeException();
		}
	}
}