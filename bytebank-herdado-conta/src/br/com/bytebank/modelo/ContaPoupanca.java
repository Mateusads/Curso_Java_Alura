package br.com.bytebank.modelo;



public class ContaPoupanca extends Conta {
	
	

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double rendimento() {
		return 0.5;
	}
	
	@Override
	public String toString() {
		return "Conta Poupança = " + super.toString();
	}
	
}