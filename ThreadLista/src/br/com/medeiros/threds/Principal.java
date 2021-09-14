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

	public static void main(String[] args) {

		ThreadList list = new ThreadList(); // Classe criado por nós é Thread-safe porém não tem todos os métodos de uma
											// List<>
		// List<String> list = new ArrayList<>(); //- Não é Thread-safe pode dar null ou
		// menas iteração que o esperado
		// List<String> list = Collections.synchronizedList(new ArrayList<>()); //É
		// Thread-safe usa syncronized na sua implementação (Uma das opções)
		// List<String> list = new Vector<>(); //É Thread-safe usa syncronized na sua
		// implementação

		new Thread(new TarefaSalvar(list), "Salve data").start();
		for (int i = 0; i < 100; i++) {
			new Thread(new TarefaAdicionarElemento(list, i)).start();
		}
	}
}
