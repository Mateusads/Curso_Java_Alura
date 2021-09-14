package br.com.medeiros.mateus.threds;

import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {

	private String texFile;
	private String nome;

	public TarefaBuscaNome(String texFile, String nome) {
		this.texFile = texFile;
		this.nome = nome;
	}

	@Override
	public void run() {
		
		try {
			Scanner scan = new Scanner(new File(texFile));
			int numeroLinha = 1;
			
			while(scan.hasNextLine()) {
				String linha = scan.nextLine();
				
				if(linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println("nomeArquivo: " + texFile + " - Linha: " + numeroLinha + " - Nome: " + linha);
				}
				numeroLinha++;
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}
		

	}

}
