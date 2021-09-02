
public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(11, 123231);
		cc.deposita(12.99);
		
		ContaPoupança cp = new ContaPoupança(11, 123123);
		cp.deposita(74.50);
		
		cc.transfere(12.78, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		System.out.println("Valor de rendimento da CC: " + cc.rendimento() + "% ao mês");
		System.out.println("Valor de rendimento da CP: " + cp.rendimento() + "% ao mês");

	}

}
