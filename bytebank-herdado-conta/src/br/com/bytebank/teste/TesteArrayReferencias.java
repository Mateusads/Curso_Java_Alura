package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TesteArrayReferencias {

	public static void main(String[] args) {

//		ContaCorrente cc1 = new ContaCorrente(10, 35);
//		ContaCorrente cc2 = new ContaCorrente(10, 12);
//		ContaCorrente cc3 = new ContaCorrente(10, 67);
//		ContaCorrente cc4 = new ContaCorrente(10, 37);
//		
//		ContaCorrente arrayCC[] = new ContaCorrente[4];
//		arrayCC[0] = cc1;
//		arrayCC[1] = cc2;
//		arrayCC[2] = cc3;
//		arrayCC[3] = cc4;
//		
//		for(int i = 0; i < arrayCC.length; i++) {
//			System.out.println(arrayCC[i].toString() + ", ");
//		}
//		

		ContaCorrente cc1 = new ContaCorrente(10, 35);
		// criar varias contas correntes iguais;
		arrayReferencia(cc1, 5);// usando polimorfismo, - recebendo uma classe Object - e a quantidade de
								// objetos a ser criados;

		ContaPoupança cp1 = new ContaPoupança(32, 56765);
		arrayReferencia(cp1, 5);

	}

	// Cria varias instancias de OBJETO
	public static void arrayReferencia(Object conta, int quantidade) {

		Object arrayCC[] = new Object[quantidade];

		for (int i = 0; i < arrayCC.length; i++) {
			arrayCC[i] = conta;

			System.out.println(arrayCC[i].toString() + ", ");
		}
		System.out.println(" ");

	}

}
