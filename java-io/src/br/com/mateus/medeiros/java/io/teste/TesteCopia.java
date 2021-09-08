package br.com.mateus.medeiros.java.io.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopia {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Fluxo de entrada de arquivos
		
		FileInputStream fls = new FileInputStream("ipsum.txt");
		InputStreamReader isr = new InputStreamReader(fls);
		BufferedReader br = new BufferedReader(isr);		
		String linha = br.readLine();
		
		//Fluxo de saída de dados.
		FileOutputStream fos = new FileOutputStream("ipsum2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		bw.write("Este arquivo é uma cópia de impsim.txt");
		bw.newLine();
		while(linha != null) {			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}	
		
		br.close();
		bw.close();
		

	}

}
