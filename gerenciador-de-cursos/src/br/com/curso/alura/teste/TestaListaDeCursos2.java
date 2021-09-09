package br.com.curso.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.curso.alura.model.Aula;
import br.com.curso.alura.model.Curso;

public class TestaListaDeCursos2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		System.out.println(javaColecoes.getAulas());

		//getAulas retorna uma lista imutavel, e não é possível alterar para organizar certo? então vamos criar uma nova variavel.
		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		//No construtor de ArrayList já posso passar essa lista imutavel e ter uma (Copia) da nossa lista para organizar como quizer.
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes);
	}
}
