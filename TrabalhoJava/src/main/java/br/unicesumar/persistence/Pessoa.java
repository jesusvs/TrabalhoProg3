package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.unicesumar.types.Sexo;


@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int idade;

	@Column(nullable = false)
	private Sexo sexo;
	
	@Column(nullable = false)
	private String cpf;
}
