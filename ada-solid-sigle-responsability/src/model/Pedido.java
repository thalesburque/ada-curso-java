package model;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

	private Long id;
	private Livraria livraria;
	private BigDecimal valorTotal;
	private List<ItemPedido> itens;
	private Cliente cliente;

	public Pedido(Long id, Livraria livraria, List<ItemPedido> itens, Cliente cliente) {
		this.id = id;
		this.livraria = livraria;
		this.itens = itens;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Livraria getLivraria() {
		return livraria;
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void calcularValorTotal() {

		this.getItens().forEach(ItemPedido::calcularPrecoTotal);

		var subtotal = getItens().stream().map(item -> item.getValorTotal()).reduce(BigDecimal.ZERO, BigDecimal::add);

		this.setValorTotal(subtotal);

	}
	

}
