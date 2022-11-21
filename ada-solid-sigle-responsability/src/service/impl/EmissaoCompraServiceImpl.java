package service.impl;

import model.Estoque;
import model.ItemPedido;
import model.Livraria;
import model.Pedido;
import service.EmissaoCompraService;

public class EmissaoCompraServiceImpl implements EmissaoCompraService {

	private Livraria livraria;

	public EmissaoCompraServiceImpl(Livraria livraria) {
		super();
		this.livraria = livraria;
	}

	@Override
	public void emitir(Pedido pedido) {

		for (ItemPedido item : pedido.getItens()) {
			var qtda = item.getQuantidade();
			var idProd = item.getProduto().getId();

			Estoque estoqueProd = new Estoque();

			for (Estoque estoque : livraria.getEstoque()) {
				if (idProd == estoque.getId()) {
					estoqueProd = estoque;
				}
			}

			if (estoqueProd == null || estoqueProd.getQuantidade() < qtda) {
				throw new RuntimeException("Não foi possível efetuar a venda");
			}
			
			if (item.getProduto().getProibido() && pedido.getCliente().getIdade() < 18) {
				throw new RuntimeException("Produto proibido para menores");
			}

		}

		for (ItemPedido item : pedido.getItens()) {
			var qtda = item.getQuantidade();
			var idProd = item.getProduto().getId();

			for (Estoque estoque : livraria.getEstoque()) {
				if (idProd == estoque.getId()) {
					estoque.remover(qtda);
				}
			}

		}

		pedido.calcularValorTotal();

		livraria.getCaixa().setValor(pedido.getValorTotal());

	}
	
	

}
