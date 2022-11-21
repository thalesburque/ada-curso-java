package model;

import java.util.HashSet;
import java.util.Set;

public class Livraria {

	private Long id;
	private Set<Produto> produtos = new HashSet<>();
	private Set<Estoque> estoque = new HashSet<>();
	private Caixa caixa;

	public Livraria() {

	}

	public Livraria(Long id, Set<Produto> produtos, Set<Estoque> estoque, Caixa caixa) {
		this.id = id;
		this.produtos = produtos;
		this.estoque = estoque;
		this.caixa = caixa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Set<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(Set<Estoque> estoque) {
		this.estoque = estoque;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
}
