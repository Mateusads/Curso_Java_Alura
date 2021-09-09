package br.com.mateus.medeiros.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			//System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %25s: %09.2f %n", 
                    tipoConta, agencia, numero, titular, saldo);

			linhaScanner.close();

//	                        String[] valores = linha.split(",");
//	                        System.out.println(valores[1]);
		}
		scanner.close();
	}
}
