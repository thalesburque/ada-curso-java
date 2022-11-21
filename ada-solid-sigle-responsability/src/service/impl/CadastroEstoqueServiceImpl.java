package service.impl;

import java.util.Set;

import model.Estoque;
import model.Livraria;
import service.CadastroEstoqueService;

public class CadastroEstoqueServiceImpl implements CadastroEstoqueService {

	private Livraria livraria;

	public CadastroEstoqueServiceImpl(Livraria livraria) {
		this.livraria = livraria;
	}

	@Override
	public void salvar(Estoque entity) {
		if (entity.getProduto().getLivraria().getId() == livraria.getId()) {
			livraria.getEstoque().add(entity);
		}

	}

	@Override
	public void excluir(Long id) {
		for (Estoque estoque : this.livraria.getEstoque()) {
			if (estoque.getId() == id) {
				this.livraria.getEstoque().remove(estoque);
			}
		}

	}

	@Override
	public Set<Estoque> listar() {
		return livraria.getEstoque();
	}

	@Override
	public Estoque buscar(Long id) {
		for (Estoque estoque : this.livraria.getEstoque()) {
			if (estoque.getId() == id) {
				return estoque;
			}
		}

		return null;
	}

}
