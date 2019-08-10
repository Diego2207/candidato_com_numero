package com.br.candidato;

public class CandidatoModel {
	private String nome;
	private int numero;
	private int votos;

	public CandidatoModel(String nome, int numero, int votos) {
		this.nome = nome;
		this.numero = numero;
		this.votos = votos;
	}

	public CandidatoModel(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public CandidatoModel() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public String toString() {
		String modelo = "";

		modelo += this.getNumero() + " ----- " + this.getNome();

		return modelo;
	}

	public String toString(String n) {
		String modelo = "";

		modelo += this.getNumero() + " ------- " + this.getNome() + "--------" + this.getVotos();

		return modelo;
	}

}
