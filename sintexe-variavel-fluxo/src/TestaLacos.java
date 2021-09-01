
public class TestaLacos {

	public static void main(String[] args) {
		
		int contador = 0;
		
		for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			System.out.println(" ");
			System.out.println(" -> Tabuada de " + multiplicador + " <-");
			for(contador = 0; contador <=10; contador++) {
				System.out.print(multiplicador * contador + " ");
			}
			System.out.println();
		}

	}

}
