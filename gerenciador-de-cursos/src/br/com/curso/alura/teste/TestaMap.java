package br.com.curso.alura.teste;

import java.util.NoSuchElementException;

import br.com.curso.alura.model.Aluno;
import br.com.curso.alura.model.Aula;
import br.com.curso.alura.model.Curso;

public class TestaMap {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 123));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 456));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 789));
		
		javaColecoes.matricula(new Aluno("Mateus", 154638));
		javaColecoes.matricula(new Aluno("João", 36542));
		javaColecoes.matricula(new Aluno("Herick", 75631));
		javaColecoes.matricula(new Aluno("Gerson", 24893));
		javaColecoes.matricula(new Aluno("Carol", 95431));
		javaColecoes.matricula(new Aluno("Mateus", 1564132));

		System.out.println(javaColecoes.getAulas());
		
		System.out.println(javaColecoes.getAlunos());
		

		try {
			//Busca Aluno por matricula usando Map<matricula, Aluno> -> Chave, valor
			Aluno alunoMatricula = javaColecoes.buscaPorMatricula(154638); 
			System.out.println(alunoMatricula);
			
			//Se a matrícula não estiver no Map<> lança exceptions NoSuchElement
			alunoMatricula = javaColecoes.buscaPorMatricula(999999);
			System.out.println(alunoMatricula);
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

	}

}
