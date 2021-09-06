package br.com.bytebank.modelo;

public class GuardadorDeObject {

	private Object[] referencia;
	private int posicaoLivre;

	public GuardadorDeObject(int tamanho) {

		this.referencia = new Object[tamanho];
		this.posicaoLivre = 0;
	}

	public void adiciona(Object obj) {
		this.referencia[posicaoLivre] = obj;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;

	}

	public Object getReferenciaIndex(int posicao) {
		return this.referencia[posicao];
	}

	public void deleteReferencia(int posicao) { // 0
		// this.referencia[posicao] = null; //[null,1,2,3,4]
		if(posicao >= posicaoLivre) {
			System.out.println("Posição não existe objeto");
			return;
		}

		for (int i = posicaoLivre; i >= posicao; i--) {
			if (posicao >= posicaoLivre - 1) break;			
			this.referencia[posicao] = referencia[posicao + 1];
			posicao++;
		}
		this.posicaoLivre--;
	}

	public String print() {
		StringBuilder ContatenaString = new StringBuilder();
		String retornoString = "";
		for (int i = 0; i < this.posicaoLivre; i++) {
			String referencia = " | " + this.referencia[i];
			ContatenaString.append(referencia);
		}
		return retornoString = ContatenaString.toString();
	}

}
