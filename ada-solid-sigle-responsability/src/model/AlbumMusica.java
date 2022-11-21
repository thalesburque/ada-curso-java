package model;

import java.math.BigDecimal;
import java.util.List;

public class AlbumMusica extends Produto{

	private List<String> musicos;
	private List<String> bandas;
	private List<String> generos;
	private List<String> selos;
	
	public AlbumMusica(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido,List<String> musicos,
			List<String> bandas, List<String> generos, List<String> selos) {
		super(id, nome, preco, livraria, proibido);
		this.musicos = musicos;
		this.bandas = bandas;
		this.generos = generos;
		this.selos = selos;
	}

	public List<String> getMusicos() {
		return musicos;
	}

	public void setMusicos(List<String> musicos) {
		this.musicos = musicos;
	}
	
	public void addMusico(String musico) {
		this.musicos.add(musico);
	}
	
	public void removeMusico(String musico) {
		this.musicos.remove(musico);
	}

	public List<String> getBandas() {
		return bandas;
	}

	public void setBandas(List<String> bandas) {
		this.bandas = bandas;
	}
	
	public void addBanda(String banda) {
		this.bandas.add(banda);
	}
	
	public void removeBanda(String banda) {
		this.bandas.remove(banda);
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

	public List<String> getSelos() {
		return selos;
	}

	public void setSelos(List<String> selos) {
		this.selos = selos;
	}
	
	public void addSelo(String selo) {
		this.generos.add(selo);
	}
	
	public void removeSelo(String selo) {
		this.generos.remove(selo);
	}
	
	
}
