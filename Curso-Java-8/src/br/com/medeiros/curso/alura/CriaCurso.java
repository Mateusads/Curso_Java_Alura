package br.com.medeiros.curso.alura;

import java.util.ArrayList;
import java.util.List;

public class CriaCurso {
	
	public List<Curso> criaCurso() {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 33));
		cursos.add(new Curso("SQL", 76));
		cursos.add(new Curso("HTML", 84));
		cursos.add(new Curso("Scala", 91));
		cursos.add(new Curso("Kotlin", 255));
		cursos.add(new Curso("C#", 23));
		cursos.add(new Curso("Flutter", 35));
		cursos.add(new Curso("Spring", 155));
		cursos.add(new Curso("Security programming", 15));
		cursos.add(new Curso("Pacote Oficce", 47));		
		return cursos;

	}

}
