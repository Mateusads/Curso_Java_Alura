

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
		


	}

}