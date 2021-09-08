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
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteCopia {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de arquivos
		
		FileOutputStream fos = new FileOutputStream("ipsum2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Estou estando se est� escrevendo no arquivo.");
		bw.newLine();
		bw.newLine();
		bw.write("Est� j� � outra linha");
		
		bw.close();
		

	}

}
