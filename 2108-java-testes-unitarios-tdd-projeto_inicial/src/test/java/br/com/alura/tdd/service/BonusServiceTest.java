package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusParaSalarioAcimaDeDezMilRetornaException() {
		BonusService bonus = new BonusService();		
		assertThrows(IllegalArgumentException.class,
				() -> bonus.calcularBonus(new Funcionario("Nome", LocalDate.now() , new BigDecimal("11000"))));
	}
	
	@Test
	void TestaMensagemExceptionBonusSalario() {
		BonusService bonus = new BonusService();		
		try {
			bonus.calcularBonus(new Funcionario("Nome", LocalDate.now() , new BigDecimal("11000")));
			fail("N�o lan�ou Exception");
		} catch (Exception e) {
			assertEquals("Sal�rio muito alto para bonus", e.getMessage());
		}
	}
	
	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() {
		BonusService bonus = new BonusService();		
		BigDecimal valorBonus = bonus.calcularBonus(new Funcionario("Nome", LocalDate.now() , new BigDecimal("1000")));
		
		assertEquals(new BigDecimal("100.0"), valorBonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorcentoDoSalarioParaValorExatamenteDezMilReais() {
		BonusService bonus = new BonusService();		
		BigDecimal valorBonus = bonus.calcularBonus(new Funcionario("Nome", LocalDate.now() , new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.0"), valorBonus);
	}

}
