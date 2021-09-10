package br.com.curso.alura.teste;

import java.util.Iterator;
import java.util.Set;

import br.com.curso.alura.model.Aluno;
import br.com.curso.alura.model.Aula;
import br.com.curso.alura.model.Curso;

public class TesteAlunoMatriculado {

	public static void main(String[] args) {

		try {

			Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

			javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
			javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
			javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

			javaColecoes.matricula(new Aluno("Mateus", 123));
			javaColecoes.matricula(new Aluno("João", 123));
			javaColecoes.matricula(new Aluno("Herick", 123));
			javaColecoes.matricula(new Aluno("Gerson", 123));
			javaColecoes.matricula(new Aluno("Carol", 123));
			javaColecoes.matricula(new Aluno("Mateus", 123));

			javaColecoes.getAlunos().forEach(alunos -> {
				System.out.println(alunos.getNome());
			});
			
			//Iterator usando no começo antes de chegar o forEach, já que um set não tem um indice
			//Não é possivel fazer o for tradicional, então tem a Collection implementa Interable
			//para que seja possível interar sobre os elementos do tipo Set<>()
			Set<Aluno> alunos2 = javaColecoes.getAlunos();
			Iterator<Aluno> iterador = alunos2.iterator();

			while (iterador.hasNext()) {
				System.out.println(iterador.next());
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
