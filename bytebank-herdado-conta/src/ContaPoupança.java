


public class ContaPoupanša extends Conta {
	
	

	public ContaPoupanša(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double rendimento() {
		return 0.5;
	}
	
	
}