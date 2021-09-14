package br.com.mateus.medeiros.banheiro;

import java.util.Random;

public class Banheiro {

	private boolean ehSujo = false;

	public void fazNumero1() throws InterruptedException {

		Thread.sleep(tempoRandom());
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " Batendo na porta" + "| Esta usado: " + ehSujo);
		
		synchronized (this) {
			System.out.println(nome + " Entrou no Banheiro" + "| Esta usado: " + ehSujo);
			while (this.ehSujo)	esperaLaFora(nome);
			
			Thread.sleep(1000);
			System.out.println(nome + " Fazendo numero 1");
			int temp = tempoRandom();
			Thread.sleep(temp);
			System.out.println(nome + " Puxando a descarga");
			System.out.println(nome + " Lavando as mãos");
			Thread.sleep(1000);
			System.out.println(nome + " Saindo do banheiro");
			String tempo = String.valueOf(temp);
			System.out.println(nome + " Demorou " + tempo.substring(0, 2) + " minutos no banheiro");
			System.out.println("-------------------------------------------------");
		}

	}

	public void fazNumero2() throws InterruptedException {
		String nome = Thread.currentThread().getName();
		Thread.sleep(tempoRandom());
		System.out.println(nome + " Batendo na porta");

		synchronized (this) {
			while (this.ehSujo)
				esperaLaFora(nome);
			System.out.println(nome + " Entrou no Banheiro" + "| Esta usado: " + ehSujo);
			System.out.println(nome + " Fazendo numero 2");
			int temp = tempoRandom() * 2;
			Thread.sleep(temp);
			System.out.println(nome + " Puxando a descarga");
			Thread.sleep(2000);
			System.out.println(nome + " Lavando as mãos");
			System.out.println(nome + " Passando bom ar");
			Thread.sleep(1000);
			System.out.println(nome + " Saindo do banheiro");
			String tempo = String.valueOf(temp);
			System.out.println(nome + " Demorou " + tempo.substring(0, 2) + " minutos no banheiro");
			System.out.println("-------------------------------------------------");
			ehSujo = true;

		}

	}

	private int tempoRandom() {
		Random aleatorio = new Random();
		return aleatorio.nextInt((1500 - 1050) + 1) + 1050;
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, banheiro está sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void limpa() throws InterruptedException {
		String nome = Thread.currentThread().getName();
		Thread.sleep(tempoRandom());
		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");

			if (!this.ehSujo) {
				System.out.println(nome + ", está limpo");
				System.out.println("-------------------------------------------------");
				return;
			}

			System.out.println(nome + " limpando o banheiro");
			this.ehSujo = false;
			try {
				Thread.sleep(tempoRandom());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.notifyAll();
			System.out.println(nome + " saindo do banheiro");
			System.out.println("-------------------------------------------------");
		}
	}

}
