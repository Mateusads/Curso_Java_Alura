package br.com.curso.alura.teste;

import java.util.ArrayList;

import br.com.curso.alura.model.Aluno;
import br.com.curso.alura.model.Aula;
import br.com.curso.alura.model.Curso;

public class TesteAlunoMatriculado {

	public static void main(String[] args) {

		try {

			Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

			javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
			javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
			javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));

			javaColecoes.matricula(new Aluno("Mateus", 123));
			javaColecoes.matricula(new Aluno("Jo�o", 123));
			javaColecoes.matricula(new Aluno("Herick", 123));
			javaColecoes.matricula(new Aluno("Gerson", 123));
			javaColecoes.matricula(new Aluno("Carol", 123));
			javaColecoes.matricula(new Aluno("Mateus", 123));

			javaColecoes.getAlunos().forEach(alunos -> {
				System.out.println(alunos.getNome());
			});
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
