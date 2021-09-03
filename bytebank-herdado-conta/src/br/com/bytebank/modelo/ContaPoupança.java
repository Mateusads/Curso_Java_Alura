package br.com.bytebank.modelo;



public class ContaPoupança extends Conta {
	
	

	public ContaPoupança(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double rendimento() {
		return 0.5;
	}
	
	
}