package model;

import java.math.BigDecimal;

public class ItemPedido {

	private Long id;
	private Produto produto;
	private Integer quantidade;
	private BigDecimal valorTotal;
	private BigDecimal valorUnitario;

	public ItemPedido(Long id, Produto produto, Integer quantidade) {
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

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void calcularPrecoTotal() {

		this.valorUnitario = this.getProduto().getPreco();
		Integer quantidade = this.getQuantidade();

		if (valorUnitario == null) {
			this.valorUnitario = BigDecimal.ZERO;
		}

		if (quantidade == null) {
			quantidade = 0;
		}
		
		this.setValorTotal(valorUnitario.multiply(new BigDecimal(quantidade)));
		
		if(this.getProduto() instanceof Livro && this.getValorTotal().compareTo(new BigDecimal(200)) == 1) {
			BigDecimal desconto = this.getValorTotal().multiply(new BigDecimal(0.15));
			this.setValorTotal(this.valorTotal.subtract(desconto));	
		}
	}

}
