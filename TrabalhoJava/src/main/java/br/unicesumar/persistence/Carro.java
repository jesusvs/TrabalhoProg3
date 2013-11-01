package br.unicesumar.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CARRO")
public class Carro extends Veiculo{

}
