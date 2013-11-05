package br.unicesumar.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Financeiro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private double financaTotal;

	@OneToMany(mappedBy="financeiro")
	private List<Recebimento> recebimento=new ArrayList<Recebimento>();
	
	public List<Recebimento> getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Recebimento recebimento) {
		this.recebimento.add(recebimento);
	}

	public double getFinancaTotal() {
		return financaTotal;
	}

	public void setFinancaTotal(double financaTotal) {
		this.financaTotal = financaTotal;
	}
	
	public Long getId() {
		return id;
	}
}
