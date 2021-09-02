public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;	
	private static int total;
	
	
	
	public abstract double rendimento();
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else
			System.out.println("Erro ao realizar operação.");
			return false;
	}
	
	boolean transfere(double valor, Conta destinatario) {
		
			if(this.saca(valor)) {
				destinatario.deposita(valor);
				System.out.println("Foi transferido");
				return true;				
			}else
				System.out.println("Transferência não realizada");
				return false;

	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
