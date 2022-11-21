package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Jogo extends Produto {

	private String distribuidora;
	private String estudio;
	private List<String> generos = new ArrayList<>();

	public Jogo(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido,String distribuidora, String estudio, List<String> generos) {
		super(id, nome, preco, livraria, proibido);
		this.distribuidora = distribuidora;
		this.estudio = estudio;
		this.generos = generos;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	public void addGenero(String genero) {
		this.generos.add(genero);
	}
	
	public void removeGenero(String genero) {
		this.generos.remove(genero);
	}

}
