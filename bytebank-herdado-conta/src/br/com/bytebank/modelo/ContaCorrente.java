package br.com.bytebank.modelo;
import br.com.bytebank.teste.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorComTaxa = valor + 0.2;
		super.saca(valorComTaxa);
	}


	@Override
	public double rendimento() {
		return 0.1;
	}


	@Override
	public double getValorImposto() {
		return this.saldo * 0.01;
	} 

}
