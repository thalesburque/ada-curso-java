package service;

import model.Pedido;

public interface EmissaoCompraService {
	
	void emitir(Pedido pedido);
	
}
