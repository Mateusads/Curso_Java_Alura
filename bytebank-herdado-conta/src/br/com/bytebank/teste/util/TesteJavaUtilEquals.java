package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteJavaUtilEquals {

	public static void main(String[] args) {

		ArrayList<ContaCorrente> listEspecifico = new ArrayList<ContaCorrente>();
		ContaCorrente cc1 = new ContaCorrente(100, 100);
		listEspecifico.add(cc1);
		ContaCorrente cc2 = new ContaCorrente(100, 100);
		// Primeira tentativa estava retornando false, apesar de ser iguais, ele está
		// comparando as referencias.
		// Cada referencia aponta para um objeto diferente, e para comparar os atributos
		// e verificar se é igual
		// devemos sobreescrever o metodo Equals da classe Object.
		System.out.println(listEspecifico.contains(cc2));

		System.out.println();
		System.out.println(listEspecifico);
	}

}
