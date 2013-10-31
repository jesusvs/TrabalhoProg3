package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recebimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private double valorRecebido;
	
	@Column
	private double valorTroco;

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public double getValorTroco() {
		return valorTroco;
	}

	public void setValorTroco(double valorTroco) {
		this.valorTroco = valorTroco;
	}

	public Long getId() {
		return id;
	}
}
