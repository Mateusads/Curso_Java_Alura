package br.com.mateus.medeiros.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		//Criando um cliente e adicionando os dados a ele.
		Cliente clienteWriter = new Cliente();
		clienteWriter.setNome("Mateus Medeiros");
		clienteWriter.setProfissao("Dev Full Stack");
		clienteWriter.setCpf("0901231231");

		// CRIANDO UM ARQUIVO
		// Usando o serializable é criado um aquivo com os dados da Classe Cliente, nesse caso do formato .bin
		// Nele é salvo o ID que está versionado na Classe cliente, e os dados em linguagem de máquina
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(clienteWriter);
		oos.close();
		
		
		//Lendo o arquivo .bin e transformando a linguagem de máquina em objeto Java.
		//OBS: é verificado o serialUID caso diferente lança excecao e não lê o arquivo.
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteReader = (Cliente) ois.readObject();
		ois.close();
		//Exibindo o arquivo no console.
		System.out.println(clienteReader.getNome());
		System.out.println(clienteReader.getCpf());
		System.out.println(clienteReader.getProfissao());
		

	}
}
