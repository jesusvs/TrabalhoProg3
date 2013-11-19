package br.unicesumar.persistence;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Corrida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column()
	private String origemCorrida;
	
	@Column()
	private String destinoCorrida;
	
	@Column()
	private BigDecimal valorTotal;
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	/*@OneToOne
	private List<Veiculo> veiculo=new ArrayList<Veiculo>();

	@OneToOne
	private List<Motorista> motorista=new ArrayList<Motorista>();*/
	
	public String getOrigemCorrida() {
		return origemCorrida;
	}

	public void setOrigemCorrida(String origemCorrida) {
		this.origemCorrida = origemCorrida;
	}

	public String getDestinoCorrida() {
		return destinoCorrida;
	}

	public void setDestinoCorrida(String destinoCorrida) {
		this.destinoCorrida = destinoCorrida;
	}
/*
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo.add(veiculo);
	}

	public List<Motorista> getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista.add(motorista);
	}
*/
	public Long getId() {
		return id;
	}
	
}
