package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto {

	private String escritor;
	private String editora;
	private List<String> generos = new ArrayList<>();
	
	public Livro(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido,String escritor, String editora, List<String> generos) {
		super(id, nome, preco, livraria, proibido);
		this.escritor = escritor;
		this.editora = editora;
		this.generos = generos;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
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
