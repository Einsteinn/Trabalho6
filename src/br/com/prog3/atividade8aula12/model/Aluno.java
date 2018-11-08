package br.com.prog3.atividade8aula12.model;

import java.io.Serializable;

public class Aluno implements Serializable {
	Integer matricula;
	String nome;
	String ra;

	private static final long serialVersionUID = 1L;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

}