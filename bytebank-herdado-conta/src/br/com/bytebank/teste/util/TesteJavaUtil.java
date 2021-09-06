package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TesteJavaUtil {

	public static void main(String[] args) {
		
		//Generics
		ArrayList listGeneric = new ArrayList();
		
		listGeneric.add(new ContaCorrente(10, 10));
		listGeneric.add(new ContaPoupança(10, 20));
		System.out.println(listGeneric);
		
		//Especifico
		ArrayList<ContaCorrente> listEspecifico = new ArrayList<ContaCorrente>();
		listEspecifico.add(new ContaCorrente(10, 10));
		//listEspecifico.add(new ContaPoupança(10, 10)); Erro de compilação / o compilador não aceita se não for da ref. Especifica.
		//Vantagens é que a chance menor de dar erro de tipagem ao execultar o codigo.
		
		System.out.println();
		System.out.println(listEspecifico);
	}

}
