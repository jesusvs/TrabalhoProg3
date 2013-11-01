package br.unicesumar.types;

public enum Marca {
	CHEVROLET("Chevrolet"),
	FORD("Ford"),
	WOLSKVAGEM("Wolskvagem"),
	CITROEN("Citroen");
	private final String descricao;
	
	Marca(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
