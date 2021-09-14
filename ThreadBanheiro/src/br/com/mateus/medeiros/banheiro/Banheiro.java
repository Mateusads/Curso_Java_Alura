package br.com.mateus.medeiros.banheiro;

import java.util.Random;

public class Banheiro {

	public void fazNumero1() throws InterruptedException {
		Thread.sleep(tempoRandom());
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " Batendo na porta");
		System.out.println();
		
		synchronized (this) {

			System.out.println(nome + " Entrou no Banheiro");
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
			System.out.println();

		}

	}

	public void fazNumero2() throws InterruptedException {
	    
		Thread.sleep(tempoRandom());
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " Batendo na porta");

		synchronized (this) {

			System.out.println(nome + " Entrou no Banheiro");
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
			System.out.println();
			

		}

	}
	
	public int tempoRandom() {
		Random aleatorio = new Random();
	    return aleatorio.nextInt((1500 - 1050) + 1) + 1050;
	}
}
