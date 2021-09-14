package br.com.mateus.medeiros.banheiro;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Banheiro banheiro = new Banheiro();



			Thread convidado1 = new Thread(new TarefaBanheiro2(banheiro), "Alisson");			
			Thread convidado2 = new Thread(new TarefaBanheiro1(banheiro), "Guilherme");
			convidado2.setPriority(Thread.MAX_PRIORITY);
			Thread convidado3 = new Thread(new TarefaBanheiro1(banheiro), "Felipe");
			Thread convidado4 = new Thread(new TarefaBanheiro2(banheiro), "Diogo");
			Thread convidado5 = new Thread(new TarefaBanheiro1(banheiro), "Felipe");
			convidado5.setPriority(Thread.MAX_PRIORITY);
			Thread convidado6 = new Thread(new TarefaBanheiro2(banheiro), "Paulo");
			Thread convidado7 = new Thread(new TarefaBanheiro1(banheiro), "Henrique");
			convidado7.setPriority(Thread.MAX_PRIORITY);
			Thread convidado8 = new Thread(new TarefaBanheiro2(banheiro), "Ganso");
			Thread funcionario = new Thread(new TarefaLimpeza(banheiro), "Func. Limpeza");		
			funcionario.setDaemon(true);
			funcionario.start();
			
			convidado1.start();
			convidado2.start();
			convidado3.start();
			convidado4.start();
			convidado5.start();
			convidado6.start();
			convidado7.start();
			convidado8.start();

		
	}
}
