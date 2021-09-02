
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		System.out.println("Bonificacao = " + f.getNome() +" é "+f.getBonificacao());
	    double boni = f.getBonificacao();
	    this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
