package service;

import java.util.Set;

public interface CadastroService<T, ID> {

	void salvar(T entity);
	
	void excluir(ID id);
	
	Set<T> listar();
	
	T buscar(ID id);
		
}
