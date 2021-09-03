package br.com.bytebank.modelo;
import br.com.bytebank.teste.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 10;
	}

}
