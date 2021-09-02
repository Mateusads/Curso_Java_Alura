
public class TesteGetSet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setAgencia(1);
		conta.setNumero(141414);
		
		System.out.println("AG:" + conta.getAgencia() + " Conta: " + conta.getNumero() );
	}

}
