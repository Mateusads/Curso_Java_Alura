package br.com.curso.alura.teste;

import br.com.curso.alura.model.Aula;
import br.com.curso.alura.model.Curso;

public class TestaListaDeCurso {

	public static void main(String[] args) {
		
		Curso novoCurso = new Curso("Java Coleções", "Pedro Silveira");
		
		novoCurso.adiciona(new Aula("Trabalhando com ArrayList", 20));
		novoCurso.adiciona(new Aula("Criando Classe Aula", 18));
		novoCurso.adiciona(new Aula("Relacionamento com Coleções", 22));
		
		System.out.println(novoCurso.getAulas());
		
		

	}

}
