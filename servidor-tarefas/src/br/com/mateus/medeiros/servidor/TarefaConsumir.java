package br.com.mateus.medeiros.servidor;

import java.util.concurrent.BlockingQueue;

public class TarefaConsumir implements Runnable {

	private BlockingQueue<String> filaComando;

	public TarefaConsumir(BlockingQueue<String> filaComando) {
		this.filaComando = filaComando;
	}

	@Override
	public void run() {
		try {
			String comando = null;

			while ((comando = filaComando.take()) != null) {

				System.out.println(
						"Consumindo fila comando: " + comando + " | Thread name: " + Thread.currentThread().getName());
				Thread.sleep(2);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
