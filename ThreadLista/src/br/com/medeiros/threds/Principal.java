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

		ThreadList list = new ThreadList(); // Classe criado por n�s � Thread-safe por�m n�o tem todos os m�todos de uma
											// List<>
		// List<String> list = new ArrayList<>(); //- N�o � Thread-safe pode dar null ou
		// menas itera��o que o esperado
		// List<String> list = Collections.synchronizedList(new ArrayList<>()); //�
		// Thread-safe usa syncronized na sua implementa��o (Uma das op��es)
		// List<String> list = new Vector<>(); //� Thread-safe usa syncronized na sua
		// implementa��o

		new Thread(new TarefaSalvar(list), "Salve data").start();
		for (int i = 0; i < 100; i++) {
			new Thread(new TarefaAdicionarElemento(list, i)).start();
		}
	}
}
