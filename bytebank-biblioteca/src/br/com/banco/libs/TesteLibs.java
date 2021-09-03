package br.com.banco.libs;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteLibs {

	public static void main(String[] args) {


		Conta cc = new ContaCorrente(110, 120);
		
		cc.deposita(100);
		System.out.println(cc.getSaldo());

	}

}
