package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {	

	private ReajusteService service;
	private Funcionario func;
	
	@BeforeEach
	public void inicializa() {
		service = new ReajusteService();
		func = new Funcionario("Testelino", LocalDate.now(), new BigDecimal(1000.0));
	}

	@Test
	public void reajusta3porcentoSeODesempenhoForADesejar() {
		service.reajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	
	@Test
	public void reajusta10porcentoSeODesempenhoForBom() {		
		service.reajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1100.00"), func.getSalario());
	}
	
	@Test
	public void reajusta20porcentoSeODesempenhoForOtimo() {		
		service.reajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}
	
	

}
