package br.com.mateus.medeiros.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable {
	// Observa��o para serialVersion --> Caso esse arquivo seja serializado para um doc, gera uma vers�o,
	//mas se n�o especificar o UID ele ser� gerado automaticamente pelo Java com um n�mero aleat�rio, e isso
	//pode ocorrer erros ao ler o aquivo e o Id ser diferente do esperado.
	//� uma boa pr�tica colocar o Id do serial para que ao alterar voc� tenha controle nas vers�es da classe;
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
