
public class TestaConta {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		
		Conta contaPaulo = new Conta();
		contaPaulo.titular = paulo;
		
		System.out.println(contaPaulo.titular.nome);
		
		contaPaulo.deposita(100);
		//System.out.println(contaPaulo.saldo); --> sem encapsulamento
		System.out.println(contaPaulo.getSaldo()); //-- com encapsulamento

	}

}
