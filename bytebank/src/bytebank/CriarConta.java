package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		/*
		 * primeiraConta.saldo = 200; System.out.println(primeiraConta.saldo);
		 * primeiraConta.saldo += 100; System.out.println(primeiraConta.saldo); Conta
		 * segundaConta = primeiraConta; segundaConta.saldo = 50;
		 * System.out.println("primeira conta tem " + primeiraConta.saldo);
		 * System.out.println("segunda conta tem " + segundaConta.saldo);
		 */
		
		System.out.println("Deposita 100");
		primeiraConta.deposita(100);
		System.out.println("Valor do saldo atual = " + primeiraConta.saldo);
		
		System.out.println("Saca 75");
		boolean retorno = primeiraConta.saca(75);
		System.out.println("Tem o valor  = " + retorno);
		System.out.println("Valor do saldo atual = " + primeiraConta.saldo);
		
		System.out.println("Saca 80");
		retorno = primeiraConta.saca(80);
		System.out.println("Tem o valor  = " + retorno);
		System.out.println("Valor do saldo atual = " + primeiraConta.saldo);
		
		
		
	}

}
