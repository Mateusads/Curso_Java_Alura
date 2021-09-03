public class Administrador extends Funcionario implements Autenticavel {

	private AutenticaUsuario autenticador;

	public Administrador() {

		autenticador = new AutenticaUsuario();
	}

	@Override
	public double getBonificacao() {
		return 50;
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