package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recebimento {

=======
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.types.TipoPagamento;

@Entity
public class Recebimento {
	
>>>>>>> origin/MapeamentoDasClasses
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
<<<<<<< HEAD
	@Column
	private double valorRecebido;
	
	@Column
	private double valorTroco;

=======
	@Column(nullable = false)
	private double valorRecebido;
	
	@Column(nullable = false)
	private double valorTroco;

	@ManyToOne
	private Financeiro financeiro;
	
	@ManyToOne
	private Veiculo veiculo;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Enumerated(EnumType.STRING)
	private TipoPagamento tipoPagamento;
	
	
	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}
	
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

>>>>>>> origin/MapeamentoDasClasses
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
<<<<<<< HEAD
=======

>>>>>>> origin/MapeamentoDasClasses
}
