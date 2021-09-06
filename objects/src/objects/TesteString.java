package objects;

public class TesteString {	

	public static void main(String[] args) {
		
		//String Builder implementa CharSequence.
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("lu");

		nome = nome.replace("LU", cs);

		System.out.println(nome);
		System.out.println("");
		
		///Usando StringBuilder para contatenar e não precisar criar inumeros objetos "lembrando que String é imutavel."
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		System.out.println("");
		
		
		char c = nome.charAt(3); //char i
		System.out.println("Printando o charAt(3)= " + c);
		System.out.println("");

		int pos = nome.indexOf("lu");
		System.out.println("Usando indexOf=  " + pos);

		System.out.println("");
		String sub = nome.substring(1);
		System.out.println("Usando substring(1)= " + sub);
		System.out.println("");
		System.out.println("Criando um for com charAt() ");
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		} 
		
//		AluRA
//
//		Socorram-me, subi no ônibus em Marrocos
//
//		Printando o charAt(3)= R
//
//		Usando indexOf=  1
//
//		Usando substring(1)= luRA
//
//		Criando um for com charAt() 
//		A
//		l
//		u
//		R
//		A

	}

}
