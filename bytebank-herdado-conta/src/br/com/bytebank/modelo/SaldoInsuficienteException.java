package br.com.bytebank.modelo;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}