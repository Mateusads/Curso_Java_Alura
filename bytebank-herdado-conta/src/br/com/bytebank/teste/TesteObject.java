package br.com.bytebank.teste;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteObject {
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		ContaPoupanca cp = new ContaPoupanca(1010, 1212);
		ContaCorrente cc = new ContaCorrente(10, 23);		
		
		recebe(cp);
		recebe(cc);
	}	
	
	public static void recebe(Object obj) {
		//System.out.println(obj.toString()); Não é preciso chamar o método toString ele já faz isso automáico implicitamente.
		System.out.println(obj);
	}

}
