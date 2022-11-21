package model;

import java.math.BigDecimal;
import java.util.List;

public class Filme extends Produto {

	private String estudio;
	private List<String> diretores;
	private List<String> generos;
	private List<String> produtores;

	public Filme(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido,String estudio, List<String> diretores,
			List<String> generos, List<String> produtores) {
		super(id, nome, preco, livraria, proibido);
		this.estudio = estudio;
		this.diretores = diretores;
		this.generos = generos;
		this.produtores = produtores;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public List<String> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<String> diretores) {
		this.diretores = diretores;
	}
	
	public void addDiretore(String diretor) {
		this.diretores.add(diretor);
	}
	
	public void removeDiretore(String diretor) {
		this.diretores.remove(diretor);
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

	public List<String> getProdutores() {
		return produtores;
	}

	public void setProdutores(List<String> produtores) {
		this.produtores = produtores;
	}
	
	public void addProdutor(String produtor) {
		this.produtores.add(produtor);
	}
	
	public void removeProdutor(String produtor) {
		this.produtores.remove(produtor);
	}
	

}
