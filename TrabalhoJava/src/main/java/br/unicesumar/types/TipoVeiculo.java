package br.unicesumar.types;

public enum TipoVeiculo {
	MINIVAN("Minivan"),
	ESPORTIVO("Esportivo"),
	SEDAN("Sedan"),
	HATCH("Hatch");
	
	private final String descricao;
	
	TipoVeiculo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
