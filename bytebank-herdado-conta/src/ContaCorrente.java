

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	boolean saca(double valor) {
		double valorComTaxa = valor + 0.2;
		return super.saca(valorComTaxa);
	}

}
