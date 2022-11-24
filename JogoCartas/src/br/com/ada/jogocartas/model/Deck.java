package br.com.ada.jogocartas.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private Integer id;

    List<Carta> cartas = new ArrayList<>();

    public Deck(Integer id, List<Carta> cartas) {
        this.id = id;
        this.cartas = cartas;
    }
}
