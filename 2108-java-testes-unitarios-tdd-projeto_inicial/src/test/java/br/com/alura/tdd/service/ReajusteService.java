package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {


	public void reajuste(Funcionario func, Desempenho desempenho) {
		
		if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajusteSalario = func.getSalario().multiply(new BigDecimal(0.03).setScale(2, RoundingMode.HALF_UP));
			func.reajusteSalario(reajusteSalario);			
		}else if(desempenho == Desempenho.BOM) {
			BigDecimal reajusteSalario = func.getSalario().multiply(new BigDecimal(0.10).setScale(2, RoundingMode.HALF_UP));
			func.reajusteSalario(reajusteSalario);
		}else if(desempenho == Desempenho.OTIMO) {
			BigDecimal reajusteSalario = func.getSalario().multiply(new BigDecimal(0.20).setScale(2, RoundingMode.HALF_UP));
			func.reajusteSalario(reajusteSalario);
		}
		
	}

}
