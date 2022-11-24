package br.com.ada.jogocartas.model;

public abstract class Carta {

	private String nome;
	private String tipo;
	private Integer custo;

	public Carta(String nome, String tipo, Integer custo) {
		this.nome = nome;
		this.tipo = tipo;
		this.custo = custo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public Integer getCusto() {
		return custo;
	}


}
