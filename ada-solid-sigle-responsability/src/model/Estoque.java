package model;

import java.util.Objects;

public class Estoque {

	private Long id;
	private Produto produto;
	private Integer quantidade;

	public Estoque() {

	}

	public Estoque(Long id, Produto produto, Integer quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void adicionar(Integer quantidade) {
		this.quantidade += quantidade;
	}

	public void remover(Integer quantidade) {
		this.quantidade -= quantidade;
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
		Estoque other = (Estoque) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Estoque [id=" + id + ", produto=" + produto.getNome() + ", quantidade=" + quantidade + "]";
	}

}
