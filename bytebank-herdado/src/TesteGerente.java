

public class TesteGerente {

    public static void main(String[] args) {
        
		Gerente g1 = new Gerente();
		g1.setNome("Lucas");
		g1.setCpf("01212346-9");
		
		g1.setSalario(4990.80);
		System.out.println(g1.getNome());
		System.out.println("Salário " + g1.getSalario());
		
        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println("Autenticou? = "+ autenticou);
		System.out.println("Bonificação " + g1.getBonificacao());
    }

}