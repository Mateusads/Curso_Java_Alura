package br.com.medeiros.curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.medeiros.curso.alura.CriaCurso;
import br.com.medeiros.curso.alura.Curso;

public class TesteStream {
	
	private static final CriaCurso novosCursos = new CriaCurso();

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos = novosCursos.criaCurso();
		
		//Intera a Lista printando os elementos ( Como Lista possiu forEach não é comum usar assim,
		//Porém é usando o forEach após fazer outras ações com Stream, abaixo alguns exemplos;
		
		//cursos.stream().forEach(c -> System.out.println("Curso: " + c.getNome() + " | Alunos: " +  c.getAlunos()));
		
		//Como nesse caso printa somente os cursos com + de 150 Alunos
		
		//cursos.stream().filter(c -> c.getAlunos() > 150)
		//.forEach(c -> System.out.println("Curso: " + c.getNome() + " | Alunos: " +  c.getAlunos()));
		
		//Como nesse caso printa somente o retorno de getAlunos / poderia usar o mapToInt para não precisar fazer unboxing (transformar o int para Integer)
		//cursos.stream().map(c -> c.getAlunos())
		//.forEach(c -> System.out.println("Numero alunos: " + c));
		
		//Para exemplo retornamos um Double, depois de filtrar com somente cursos com + de 100 alunos,
		//Guardamos somente os alunos com mapToInt
		//Average tira a média de alunos por curso
		//retorna um Double que é printado abaixo.
//		double media = cursos.stream().
//			filter(c -> c.getAlunos() >= 50 ).
//			mapToInt(Curso::getAlunos).
//			average().
//			getAsDouble();
//		System.out.println(media);	
		
		//Retorna um Optinal de Double, e caso for dividir por 0 não lança a exception
		//Optinal é uma maneira de trabalhar com possíveis valores Null
//		OptionalDouble media = cursos.stream()
//				.filter(c -> c.getAlunos() >= 50 )
//				.mapToInt(Curso::getAlunos)
//				.average();

		
		//collect podemos transformar o Stream em uma lista novamente, nesse caso foi em Map, e passamos chave valor.
		//filtramos cursos com menos de 50 alunos
		//guardamos em MAP com chave Alunos para Curso;
		//e no metodo do map já possui o forEach que é BiConsumer, podemos ver no cod como fica.
		cursos.stream()
			.filter(c -> c.getAlunos() <= 50)
			.collect(Collectors.toMap(c -> c.getAlunos(), c -> c.getNome()))
			.forEach((alunos, curso) -> System.out.println("Tem " + alunos + " no Curso de: " + curso));
		
			

	}

}
