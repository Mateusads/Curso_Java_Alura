public class Gerente extends Funcionario implements Autenticavel {

        private int senha;

        @Override
        public double getBonificacao() {
                System.out.println("Chamando o método de bonificacao do GERENTE");
                return super.getSalario();
        }

    	@Override
    	public boolean autentica(int senha) {		
    		if (this.senha == senha) {
    			System.out.println("Autenticou");
    			return true;
    		} else {
    			System.out.println("Não Autenticou");
    			return false;
    		}
    	}
    	@Override
    	public void setSenha(int senha) {
    		this.senha = senha;
    		
    	}
}