package br.com.ada.jogocartas.model;

public class CartaAtaqueEspecial extends CartaAtaque {

	private String efeito;

	public CartaAtaqueEspecial(String nome, String tipo, Integer custo, Integer poder, Integer resistencia, String efeito) {
		super(nome, tipo, custo, poder, resistencia);
		this.efeito = efeito;
	}

	public String getEfeito() {
		return this.efeito;
	};
	
}
