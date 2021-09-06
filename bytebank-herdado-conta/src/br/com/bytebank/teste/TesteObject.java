package br.com.bytebank.teste;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanša;

public class TesteObject {
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		ContaPoupanša cp = new ContaPoupanša(1010, 1212);
		ContaCorrente cc = new ContaCorrente(10, 23);
		
		recebe(cp);
		recebe(cc);
		recebe(cliente);
	}	

	
	public static void recebe(Object obj) {
		System.out.println(obj);
	}

}
