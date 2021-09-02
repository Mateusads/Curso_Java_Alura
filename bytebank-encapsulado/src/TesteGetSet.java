
public class TesteGetSet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1, 141414);
		System.out.println("AG:" + conta.getAgencia() + " Conta: " + conta.getNumero() + " | Total de Contas é = " + Conta.getTotal() );
		
		Conta conta2 = new Conta(1, 121212);
		System.out.println("AG:" + conta2.getAgencia() + " Conta: " + conta2.getNumero() + " | Total de Contas é = " + Conta.getTotal() );
		
		Conta conta3 = new Conta(1, 111111);
		System.out.println("AG:" + conta3.getAgencia() + " Conta: " + conta3.getNumero() + " | Total de Contas é = " + Conta.getTotal() );
		
		Conta conta4 = new Conta(1, 101010);
		System.out.println("AG:" + conta4.getAgencia() + " Conta: " + conta4.getNumero() + " | Total de Contas é = " + Conta.getTotal() );
		
//		conta.setAgencia(1);
//		conta.setNumero(141414);
		
	}

}
