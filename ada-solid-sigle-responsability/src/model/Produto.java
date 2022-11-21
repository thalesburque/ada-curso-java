package model;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Produto {

	private Long id;
	private String nome;
	private BigDecimal preco;
	private Livraria livraria;
	private Boolean proibido;

	public Produto(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.livraria = livraria;
		this.proibido = proibido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Livraria getLivraria() {
		return livraria;
	}

	public Boolean getProibido() {
		return proibido;
	}

	public void setProibido(Boolean proibido) {
		this.proibido = proibido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
