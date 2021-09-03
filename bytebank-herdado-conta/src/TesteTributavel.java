
public class TesteTributavel {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(1000, 1231);
		cc.deposita(10000.0);
		SeguroDeVida sd = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(sd);
		calc.registra(cc);
		
		System.out.println("Calc Imp: " + calc.getTotalImposto());
	}

}
