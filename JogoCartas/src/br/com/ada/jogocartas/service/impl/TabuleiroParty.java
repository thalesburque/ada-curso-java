package br.com.ada.jogocartas.service.impl;

import br.com.ada.jogocartas.model.Carta;
import br.com.ada.jogocartas.model.CartaAtaque;
import br.com.ada.jogocartas.model.Deck;
import br.com.ada.jogocartas.service.Tabuleiro;

import java.util.List;

public class TabuleiroParty implements Tabuleiro {

    List<Deck> cartasNaMao;

    List<Deck> cartasNaMesa;

    List<Deck> cartasForaDoJogo;

    @Override
    public void setDeck() {

    }

    @Override
    public Boolean verificaCarta(CartaAtaque cartaAtaque) {
        return null;
    }

    @Override
    public Integer getVencedor() {
        return null;
    }
}
