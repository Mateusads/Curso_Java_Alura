package br.com.mateus.medeiros.banheiro;

public class Principal {

	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaBanheiro2(banheiro), "Alisson");
		Thread convidado2 = new Thread(new TarefaBanheiro1(banheiro), "Guilherme");
		Thread convidado3 = new Thread(new TarefaBanheiro1(banheiro), "Felipe");
		Thread convidado4 = new Thread(new TarefaBanheiro2(banheiro), "Diogo");
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();

	}

}
