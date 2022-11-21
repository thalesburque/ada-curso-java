package model;

import java.math.BigDecimal;

public class Caixa {

	private BigDecimal valor;

	public Caixa() {
		this.valor = BigDecimal.ZERO;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void addValorVenda(BigDecimal valor) {
		this.valor.add(valor);
	}

}
