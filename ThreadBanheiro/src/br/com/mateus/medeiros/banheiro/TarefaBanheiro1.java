package br.com.mateus.medeiros.banheiro;

public class TarefaBanheiro1 implements Runnable {

	private Banheiro banheiro;

	public TarefaBanheiro1(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		try {
			banheiro.fazNumero1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
