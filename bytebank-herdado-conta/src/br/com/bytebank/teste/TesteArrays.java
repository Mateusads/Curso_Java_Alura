package br.com.bytebank.teste;

public class TesteArrays {

	public static void main(String[] args) {

		printArrayIdades(10);//Chama a função como parametro o tamanho do array
		
	}
	
	
	//Pega a variavel tamanho cria um array e no loop preenche o arr
	static void printArrayIdades(int tamanho) {	
		
		int idades[] = new int[tamanho];		
		for(int i = 0; i < idades.length; i++) {			
			idades[i] = i+1 * 3;
			System.out.print(idades[i] + ", " );
		}
	}

}
