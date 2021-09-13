package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajuste(Funcionario func, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentual();
		BigDecimal reajuste = func.getSalario().multiply(percentual);
		func.reajusteSalario(reajuste);		
	}
}
