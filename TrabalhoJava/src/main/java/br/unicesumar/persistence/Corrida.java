package br.unicesumar.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Corrida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String origemCorrida;
	
	@Column(nullable = false)
	private String destinoCorrida;
	
	@Column(nullable = false)
	private double distanciaPercorrida;
	
	@Column(nullable = false)
	private int qtdCorridasDia;
	
	@Column(nullable = false)
	private Date dataDaCorrida;
	
	@OneToMany(mappedBy="recebimento;")
	private List<Recebimento> corrida=new ArrayList<Recebimento>();

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

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public int getQtdCorridasDia() {
		return qtdCorridasDia;
	}

	public void setQtdCorridasDia(int qtdCorridasDia) {
		this.qtdCorridasDia = qtdCorridasDia;
	}

	public Date getDataDaCorrida() {
		return dataDaCorrida;
	}

	public void setDataDaCorrida(Date dataDaCorrida) {
		this.dataDaCorrida = dataDaCorrida;
	}

	public List<Recebimento> getCorrida() {
		return corrida;
	}

	public void setCorrida(Recebimento corrida) {
		this.corrida.add(corrida);
	}

	public Long getId() {
		return id;
	}
	
}
