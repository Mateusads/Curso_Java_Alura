
public class Cliente implements Autenticavel {
	
	private AutenticaUsuario autenticador;
    
	public Cliente() {
    	   autenticador = new AutenticaUsuario();
       }

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
		
	}

}
