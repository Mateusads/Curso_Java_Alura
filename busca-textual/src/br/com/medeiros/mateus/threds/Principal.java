package br.com.medeiros.mateus.threds;

public class Principal {

	public static void main(String[] args) {

		String nome = "a";


			Thread threadAssinatura1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nome));
			Thread threadAssinatura2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nome));
			Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt", nome));
			threadAssinatura1.start();
			threadAssinatura2.start();
			threadAutores.start();
		
	}

}
