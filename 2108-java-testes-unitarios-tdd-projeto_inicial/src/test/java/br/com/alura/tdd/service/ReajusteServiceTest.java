package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajusta3porcentoSeODesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Testelino", LocalDate.now(), new BigDecimal(1000.0));
		service.reajuste(func, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	


}
