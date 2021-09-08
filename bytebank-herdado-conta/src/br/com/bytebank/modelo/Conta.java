package br.com.bytebank.modelo;

/**
 * Classe abstrata de Conta para servir de superClass para outras contas
 * 
 * @author mateus.medeiros
 * @version 1.0 Alguns modelos de anotação
 */

/*
 * Outros parâmetros que podem ser usados.
 * 
 * @param (usado no método e construtor)
 * 
 * @return (usado apenas no método)
 * 
 * @exception ou @throws (no método ou construtor)
 * 
 * @see
 * 
 * @since
 * 
 * @serial
 * 
 * @deprecated
 */

public abstract class Conta implements Comparable<Conta> {

	// double saldo; - <<private package>> nem classes filhas podem ver fora do
	// pacote
	// private double saldo; - <Private> pode ser visto somente dentro da classe.
	protected double saldo; // <Protected> privado para os pacotes e suas classes filhas.
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

	/**
	 * Valor precisa ser maior que o saldo para não gerar a excecao.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Erro no saldo: Saldo " + this.saldo + " Valor:" + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destinatario) throws SaldoInsuficienteException {
		saca(valor);
		destinatario.deposita(valor);
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

	public void setTitular(Cliente clienteCC1) {
		this.titular = clienteCC1;

	}

	public Cliente getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		return "Agencia: " + this.agencia + ", Número: " + this.numero + ", Saldo: " + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		Conta cta = (Conta) obj;		
		if(this.agencia != cta.getAgencia()) return false; //As Agencias são iguais? se for diferente já retorna false;
		if(this.numero != cta.getNumero()) return false; //Os números são iguais? se for diferente já retorna false;
		return true; //Se chegou aqui as duas são iguais então retorna true;		
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}
	
	
}
