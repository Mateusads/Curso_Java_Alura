package br.com.medeiros.threds;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		

		//ThreadList list = new ThreadList(); - Classe criado por n�s � Thread-safe por�m n�o tem todos os m�todos de uma List<>
		//List<String> list = new ArrayList<>(); //- N�o � Thread-safe pode dar null ou menas itera��o que o esperado
		//List<String> list = Collections.synchronizedList(new ArrayList<>()); //� Thread-safe usa syncronized na sua implementa��o (Uma das op��es)
		List<String> list = new Vector<>(); //� Thread-safe usa syncronized na sua implementa��o

		for (int i = 0; i < 100; i++) {
			new Thread(new TarefaAdicionarElemtento(list, i)).start();
		}
		list.add("Thread - " + 1000);
		Thread.sleep(1000);
		
		try {
			salvaArquivo(list);
			
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	public static void salvaArquivo(List<String> list) throws IOException {

		FileOutputStream fos = new FileOutputStream("thread-safe.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Este arquivo foi criado usando thread-safe");
		bw.newLine();
		int c = 0;

		for (int i = 0; i < list.size(); i++) {
			
			String linha = "Thread - " + i + "  ";	
			bw.write(linha);
			
			if(c >= 10) {
				bw.newLine();
				c = 0;
			}
			
			c++;
			System.out.println(linha);
		}

		bw.close();
	}

}
