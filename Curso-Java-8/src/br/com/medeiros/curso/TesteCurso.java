package br.com.medeiros.curso;

import java.util.ArrayList;
import java.util.List;
import br.com.medeiros.curso.alura.*;

public class TesteCurso {
	
	private static final CriaCurso novosCursos = new CriaCurso();

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos = novosCursos.criaCurso();
		
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
