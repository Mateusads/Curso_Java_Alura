package br.com.bytebank.modelo;



public class ContaPoupan�a extends Conta {
	
	

	public ContaPoupan�a(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double rendimento() {
		return 0.5;
	}
	
	
}