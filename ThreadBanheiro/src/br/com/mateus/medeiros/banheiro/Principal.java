package br.com.mateus.medeiros.banheiro;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Banheiro banheiro = new Banheiro();

		for (int i = 0; i <= 10;) {

			Thread convidado1 = new Thread(new TarefaBanheiro2(banheiro), "Alisson");
			Thread convidado2 = new Thread(new TarefaBanheiro1(banheiro), "Guilherme");
			Thread convidado3 = new Thread(new TarefaBanheiro1(banheiro), "Felipe");
			Thread convidado4 = new Thread(new TarefaBanheiro2(banheiro), "Diogo");
			Thread funcionario = new Thread(new TarefaLimpeza(banheiro), "Func. Limpeza");

			convidado1.start();
			Thread.sleep(5000);
			convidado2.start();
			Thread.sleep(5000);
			convidado3.start();
			Thread.sleep(5000);
			convidado4.start();
			funcionario.start();
			Thread.sleep(5000);
		}
	}
}
