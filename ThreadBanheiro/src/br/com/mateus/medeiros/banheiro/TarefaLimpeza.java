package br.com.mateus.medeiros.banheiro;

public class TarefaLimpeza implements Runnable {

	private Banheiro banheiro;

	public TarefaLimpeza(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		try {
			banheiro.limpa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
