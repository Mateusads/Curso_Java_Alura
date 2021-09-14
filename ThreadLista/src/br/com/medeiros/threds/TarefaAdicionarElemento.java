package br.com.medeiros.threds;

public class TarefaAdicionarElemento implements Runnable {

	private ThreadList list;
	private int inumero;

	public TarefaAdicionarElemento(ThreadList list, int numeroThread) {
		this.list = list;
		this.inumero = numeroThread;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			list.adicionaElementos("Thread -- " + inumero + " -- " + i);
		}

	}

}
