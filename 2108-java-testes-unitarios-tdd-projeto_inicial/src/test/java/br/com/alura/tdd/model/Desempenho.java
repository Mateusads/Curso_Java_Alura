package br.com.alura.tdd.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentual() {
			return new BigDecimal("0.03").setScale(2, RoundingMode.HALF_UP);
		}
	}, BOM {
		@Override
		public BigDecimal percentual() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.10").setScale(2, RoundingMode.HALF_UP);
		}
	}, OTIMO {
		@Override
		public BigDecimal percentual() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20").setScale(2, RoundingMode.HALF_UP);
		}
	};
	
	public abstract BigDecimal percentual();

}
