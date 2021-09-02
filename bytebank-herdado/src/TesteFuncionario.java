

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Mateus Medeiros");
		f1.setCpf("034698846-9");
		f1.setSalario(2990.80);
		System.out.println(f1.getNome());
		System.out.println("Salário " + f1.getSalario());
		System.out.println("Bonificação " + f1.getBonificacao());
		System.out.println();
		
		Gerente g1 = new Gerente();
		g1.setNome("Lucas");
		g1.setCpf("01212346-9");
		g1.setSalario(4990.80);
		System.out.println(g1.getNome());
		System.out.println("Salário " + g1.getSalario());
		System.out.println("Bonificação " + g1.getBonificacao());

	}

}