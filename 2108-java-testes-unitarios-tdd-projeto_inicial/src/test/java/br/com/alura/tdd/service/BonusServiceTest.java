package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaSalarioMaiorQueMil() {
		BonusService bonus = new BonusService();		
		BigDecimal valorBonus = bonus.calcularBonus(new Funcionario("Nome", LocalDate.now() , new BigDecimal("11000")));
		
		assertEquals(new BigDecimal("0"), valorBonus);
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
