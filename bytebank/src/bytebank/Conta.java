package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;	
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else
			return false;
	}

}
