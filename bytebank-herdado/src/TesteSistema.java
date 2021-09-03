
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		g1.setSenha(123);

		Administrador adm1 = new Administrador();
		adm1.setNome("Rafael");
		adm1.setSalario(4500.0);
		adm1.setSenha(321);
		
		Cliente c1 = new Cliente();
//		c1.setNome("Cliente");
//		c1.setSalario(4500.0);
		c1.setSenha(432);


		adm1.autentica(321);
		g1.autentica(123);
		c1.autentica(432);
		
		Autenticavel referencia;
		referencia = adm1;
		System.out.println("REF: " + referencia);
		referencia = g1;
		System.out.println("REF: " + referencia);
		referencia = c1;
		System.out.println("REF: " + referencia);
		
		
		
	}

}
