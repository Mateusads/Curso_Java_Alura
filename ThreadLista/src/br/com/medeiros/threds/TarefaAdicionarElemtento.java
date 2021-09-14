package br.com.medeiros.threds;

import java.util.List;

public class TarefaAdicionarElemtento implements Runnable {

	private List<String> list;
	private int inumero;

	public TarefaAdicionarElemtento(List<String> list2, int numeroThread) {
		this.list = list2;
		this.inumero = numeroThread;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			list.add("Thread " + inumero + " -- " + i);
		}

	}

}
