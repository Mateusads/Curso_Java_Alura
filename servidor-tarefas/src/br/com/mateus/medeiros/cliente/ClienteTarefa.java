package br.com.mateus.medeiros.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefa {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("Conexão Estabelecida");

		Thread threadEnviaComando = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println("Pode enviar comandos!");
					PrintStream saida = new PrintStream(socket.getOutputStream());
					String s = "c3";
					while (true) {
						

						for (int i = 0; i <= 90000; i++) {
							saida.println(s);
							Thread.sleep(5);
							if (i == 90000) {
								s = "";
							}
						}

						if (s.equals("")) {
							break;
						}

					}

					saida.close();

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});

		Thread threadRecebeResposta = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println("Recebendo dados do servidor");
					Scanner respostaServidor = new Scanner(socket.getInputStream());

					while (respostaServidor.hasNextLine()) {
						String linha = respostaServidor.nextLine();
						System.out.println(linha);
					}

					respostaServidor.close();

				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});

		threadRecebeResposta.start();
		threadEnviaComando.start();

		threadEnviaComando.join();

		System.out.println("Fechando o socket do cliente");

		socket.close();
	}
}