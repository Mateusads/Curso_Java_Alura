package br.com.medeiros.mateus.teste;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.medeiros.mateus.Calculadora;

public class CalculadoraTeste {
	
	@Test
	public void SomarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 11);
		
		Assert.assertEquals(21, soma);
		
	}

}
