package service.impl;

import java.util.Set;

import model.Livraria;
import model.Produto;
import service.CadastroProdutoService;

public class CadastroProdutoServiceImpl implements CadastroProdutoService {

	private Livraria livraria;

	public CadastroProdutoServiceImpl(Livraria livraria) {
		this.livraria = livraria;
	}

	@Override
	public void salvar(Produto produto) {
		this.livraria.getProdutos().add(produto);
	}

	@Override
	public void excluir(Long produtoId) {
		for (Produto produto : this.livraria.getProdutos()) {
			if (produto.getId() == produtoId) {
				this.livraria.getProdutos().remove(produto);
			}
		}

	}

	@Override
	public Set<Produto> listar() {
		return livraria.getProdutos();
	}

	@Override
	public Produto buscar(Long produtoId) {

		for (Produto produto : this.livraria.getProdutos()) {
			if (produto.getId() == produtoId) {
				return produto;
			}
		}

		return null;
	}

}
