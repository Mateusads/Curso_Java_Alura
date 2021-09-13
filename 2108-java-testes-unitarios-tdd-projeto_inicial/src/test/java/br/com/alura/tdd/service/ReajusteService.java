package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajuste(Funcionario func, Desempenho desempenho) {

		if (desempenho == Desempenho.A_DESEJAR) {
			func.reajusteSalario(reajusta(new BigDecimal("0.03"), func.getSalario()));
		} else if (desempenho == Desempenho.BOM) {
			func.reajusteSalario(reajusta(new BigDecimal("0.10"), func.getSalario()));
		} else if (desempenho == Desempenho.OTIMO) {
			func.reajusteSalario(reajusta(new BigDecimal("0.20"), func.getSalario()));
		}

	}

	private BigDecimal reajusta(BigDecimal porcentagem, BigDecimal salario) {
		return salario.multiply(porcentagem.setScale(2, RoundingMode.HALF_UP));
	}

}
