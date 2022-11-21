package model;

import java.math.BigDecimal;

public class Brinquedo extends Produto {

	private String tipo;

	public Brinquedo(Long id, String nome, BigDecimal preco, Livraria livraria, Boolean proibido,String tipo) {
		super(id, nome, preco, livraria, proibido);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
