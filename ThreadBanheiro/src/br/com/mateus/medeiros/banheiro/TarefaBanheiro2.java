package br.com.mateus.medeiros.banheiro;

public class TarefaBanheiro2 implements Runnable {

	private Banheiro banheiro;

	public TarefaBanheiro2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		try {
			banheiro.fazNumero2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
