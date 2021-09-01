
public class TestaConta {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		
		Conta contaPaulo = new Conta();
		contaPaulo.titular = paulo;
		
		System.out.println(contaPaulo.titular.nome);
		
	}

}
