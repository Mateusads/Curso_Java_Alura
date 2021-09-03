
public class TesteSaca {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente(10, 120);
		Conta c2 = new ContaCorrente(10, 130);

		try {

			c1.deposita(500);
			System.out.println("tranferindo de c1 para c2: " + c1.getSaldo());
			c1.transfere(250, c2);
			System.out.println("tranferindo de c1 para c2: " + c1.getSaldo());
			c1.transfere(250, c2);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		System.out.println("Saldo c1: " + c1.getSaldo());
		System.out.println("Saldo c2: " + c2.getSaldo());

	}
}
