package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardadorDeObject;

public class TesteGuardadorDeObjetos {

	public static void main(String[] args) {
		
		
		ContaCorrente cc1 = new ContaCorrente(0, 200);
		ContaCorrente cc2 = new ContaCorrente(0, 300);
		ContaCorrente cc3 = new ContaCorrente(0, 400);
		ContaCorrente cc4 = new ContaCorrente(0, 500);

		
		GuardadorDeObject guardador = new GuardadorDeObject(4);
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		guardador.adiciona(cc3);
		guardador.adiciona(cc4);
		//print com as 4 contas adicionadas
		System.out.println(guardador.print());
		
		//Deletando objeto no index 0
		guardador.deleteReferencia(0);
		
		System.out.println();
		System.out.println();
		//print das contas com index 0 deletado
		System.out.println(guardador.print());
		
		//adicionando novamente a conta
		guardador.adiciona(cc1);
		
		System.out.println();
		System.out.println();
		//print com as 4 contas adicionadas
		//(conta adicionado por ultimo, vai para ultima posicao)
		System.out.println(guardador.print());
		
		
		//Deletando objeto no index 2
		guardador.deleteReferencia(2);
		
		System.out.println();
		System.out.println();
		//print das contas com index 2 deletado
		System.out.println(guardador.print());
		
		
		//Deletando objeto no index 3 sem existir um objeto no index(3) retorna sem alteração
		guardador.deleteReferencia(3);

		
		System.out.println();
		System.out.println();
		//print das contas com index 3 deletado
		System.out.println(guardador.print());
		
	}

}
