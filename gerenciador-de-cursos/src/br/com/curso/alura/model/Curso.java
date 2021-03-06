package br.com.curso.alura.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas;
	private Set<Aluno> alunos;
	private Map<Integer, Aluno> matriculaParaAluno;

	public Curso(String nome, String instrutor) {
		if (nome == null) {
			throw new NullPointerException("Nome do curso n?o pode ser nulo");
		}
		this.nome = nome;
		this.instrutor = instrutor;
		this.aulas = new ArrayList<Aula>();
		this.alunos = new HashSet<Aluno>();
		this.matriculaParaAluno = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaPorMatricula(int matricula) {
		if (!matriculaParaAluno.containsKey(matricula))
			throw new NoSuchElementException("Matricula n?o est? cadastrada: " + matricula);
		return matriculaParaAluno.get(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.getNome());
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {

		return "[Curso: " + this.nome + ", " + "tempo total: " + this.getTempoTotal() + "], Aulas = " + aulas;
		// return "[Curso: = " + this.nome + ", " + tempo total:
		// <TEMPO-TOTAL-DAS-AULAS>", " aulas: [<NOME-DAS-AULAS> ", " + "]"
	}

}
