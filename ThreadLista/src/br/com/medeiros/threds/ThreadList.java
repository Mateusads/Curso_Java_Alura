package br.com.medeiros.threds;

public class ThreadList {

	private String[] elementos = new String[1000];
	private int indice = 0;

	public synchronized void adicionaElementos(String elemento) {
		this.elementos[indice] = elemento;
		this.indice++;
		
		try {
			Thread.sleep(1);
			if (this.indice == this.elementos.length) {
				System.out.println("LISTA CHEIA");
				this.notify();
			}
		} catch (Exception e) {

		}
	}

	public int tamanho() {
		return this.elementos.length;
	}

	public String pegaElemento(int posicao) {
		return this.elementos[posicao];
	}
}