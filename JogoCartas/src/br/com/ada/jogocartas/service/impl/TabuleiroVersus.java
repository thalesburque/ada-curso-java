package br.com.ada.jogocartas.service.impl;

import br.com.ada.jogocartas.model.CartaAtaque;
import br.com.ada.jogocartas.model.Deck;
import br.com.ada.jogocartas.service.Tabuleiro;

import java.util.List;

public class TabuleiroVersus implements Tabuleiro {

    List<Deck> decks;



    @Override
    public void setDeck() {

    }

    @Override
    public Boolean verificaCarta(CartaAtaque cartaAtaque) {
        return null;
    }

    @Override
    public Integer getVencedor() {
        //retornará "-1" se ninguém venceu
        return null;
    }
}
