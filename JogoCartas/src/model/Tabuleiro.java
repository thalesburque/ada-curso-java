package model;

public interface Tabuleiro {
		
	void setDeck();
	
	Boolean verificaCarta(CartaAtaque cartaAtaque);
	
	String getVencedor();

}
