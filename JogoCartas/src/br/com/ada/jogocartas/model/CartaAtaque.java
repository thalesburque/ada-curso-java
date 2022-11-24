package br.com.ada.jogocartas.model;

public class CartaAtaque extends Carta {

	private Integer poder;

	private Integer resistencia;

	public CartaAtaque(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
		super(nome, tipo, custo);
		this.poder = poder;
		this.resistencia = resistencia;
	}

	public Integer getPoder() {
		return poder;
	}

	public Integer getResistencia() {
		return resistencia;
	}


}
