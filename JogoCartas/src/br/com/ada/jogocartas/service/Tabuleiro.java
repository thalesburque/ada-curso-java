package br.com.ada.jogocartas.service;

import br.com.ada.jogocartas.model.CartaAtaque;

public interface Tabuleiro {
		
	void setDeck();
	
	Boolean verificaCarta(CartaAtaque cartaAtaque);
	
	Integer getVencedor();

}
