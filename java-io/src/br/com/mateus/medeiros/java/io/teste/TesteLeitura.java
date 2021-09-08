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

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Fluxo de entrada de arquivos
		
		FileOutputStream fos = new FileOutputStream("ipsum2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Estou estando se está escrevendo no arquivo.");
		bw.newLine();
		bw.newLine();
		bw.write("Está já é outra linha");
		
		bw.close();
		

	}

}
