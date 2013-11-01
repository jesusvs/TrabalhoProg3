package br.unicesumar.types;

public enum TipoPagamento {

	CARTAO("Cart�o"),
	AVISTA("A vista");
	
	private final String descricao;
	
	TipoPagamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
