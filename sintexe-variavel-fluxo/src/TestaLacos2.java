
public class TestaLacos2 {

	public static void main(String[] args) {

		for(int linha = 0; linha <= 10; linha++) {
			for(int contador = 0; contador <= linha; contador++) {
				System.out.print("*");
				for(int contador1 = 10; contador1 >= linha; contador1--) {
					System.out.print("*");
				}
				System.out.print("*");
			}
			System.out.print("#");
			System.out.println();
		}

	}

}
