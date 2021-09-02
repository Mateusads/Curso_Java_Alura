
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		System.out.println("Bonificacao = " + f.getNome() +" � "+f.getBonificacao());
		this.soma += f.getBonificacao();
	}
	
	public double getSoma() {
		return this.soma;
	}

}
