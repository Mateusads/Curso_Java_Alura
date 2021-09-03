package br.com.bytebank.especial;

import br.com.bytebank.modelo.Conta;

public class ContaEspecial extends Conta {
	

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public double rendimento() {
		return 0.4;
	}
	
	public double saldoCE() {
		return this.saldo;
	}
	

}
