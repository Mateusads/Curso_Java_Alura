
public class TesteWhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println("Dentro do while Numero " + contador);
			//contador = contador + 1;
			//contador += 1;
			contador++;
		}
		System.out.println("Fora do while " + contador);
	}
}
