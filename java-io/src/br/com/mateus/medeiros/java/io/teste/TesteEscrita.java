package br.com.mateus.medeiros.java.io.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Fluxo de entrada de arquivos
		
		FileInputStream fls = new FileInputStream("ipsum.txt");
		InputStreamReader isr = new InputStreamReader(fls);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {			
			System.out.println(linha);
			linha = br.readLine();
		}	
		
		br.close();
		

	}

}
