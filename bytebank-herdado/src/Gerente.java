


public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticaUsuario autenticador;
      
	public Gerente() {
    	   autenticador = new AutenticaUsuario();
       }
        

        @Override
        public double getBonificacao() {
                System.out.println("Chamando o método de bonificacao do GERENTE");
                return super.getSalario();
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