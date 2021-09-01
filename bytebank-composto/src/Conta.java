public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;	
	
	
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
	
	boolean transfere(double valor, Conta destinatario) {
		
		if(this.saldo >= valor){
			this.saca(valor);
			destinatario.deposita(valor);
			return true;
		}
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
