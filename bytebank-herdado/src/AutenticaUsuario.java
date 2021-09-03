
public class AutenticaUsuario {
	
	
	private int senha;
	

	public boolean autentica(int senha) {		
		if (this.senha == senha) {
			System.out.println("Autenticou");
			return true;
		} else {
			System.out.println("Não Autenticou");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
		
	}

}
