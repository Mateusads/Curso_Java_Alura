package br.com.medeiros.curso.alura;

import java.util.ArrayList;
import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		
		//Não pegamos o retorno dessa Stream, mas conseguimos iterar e fazer um forEach nela propria
		//Assim conseguimos filtrar com filer, e já printar na tela com o Println.
        System.out.print("Cursos com mais de 100 alunos são = " );
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.forEach(c -> System.out.print(c.getNome() + ", "));

		
		//Aqui pegamos o retorno, que é um inteiro do filtro de cursos com mais de 100 alunos
		//mapToInt - no caso da para usar somente o Map, para ser mais específico usamos mapToInt
		//Ele recebe uma função que mapeia um determinado tipo de elemento, no nosso caso o getAlunos(quantidade de alunos)
		//Por usarmos o mais especifico, temos diversos outras funções, usamos sum para apresentar, ele soma todos os numeros retornados.
		int soma = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.sum();

		//resultado da soma dos Alunos dos Cursos Filtrados (com mais de 100 alunos)
		System.out.println("Soma dos Alunos desses cursos é: " + soma);

	}

}
