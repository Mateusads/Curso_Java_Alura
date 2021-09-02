
public class Gerente extends Funcionario {
	
	int senha;
	
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	

	
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}
	
}
