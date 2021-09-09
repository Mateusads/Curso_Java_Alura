package br.com.mateus.medeiros.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable {
	// Observação para serialVersion --> Caso esse arquivo seja serializado para um doc, gera uma versão,
	//mas se não especificar o UID ele será gerado automaticamente pelo Java com um número aleatório, e isso
	//pode ocorrer erros ao ler o aquivo e o Id ser diferente do esperado.
	//É uma boa prática colocar o Id do serial para que ao alterar você tenha controle nas versões da classe;
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
