package br.unicesumar.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import br.unicesumar.types.Marca;
import br.unicesumar.types.TipoVeiculo;

public class VeiculoTest {
	private Veiculo c = new Veiculo();

	@Test
	public void testVeiculo() {
		iniciarVeiculo();
		assertFalse("Errado", c.getNomeVeiculo().equals("Opalla"));
		assertEquals(Marca.CHEVROLET, c.getMarca());
		assertFalse("Errado", c.getPlaca().equals("QWE-9874"));
	}

	public void iniciarVeiculo() {
		this.c.setMarca(Marca.CHEVROLET);
		this.c.setNomeVeiculo("Omega");
		this.c.setPlaca("AAA-1234");
		this.c.setTipoVeiculo(TipoVeiculo.SEDAN);
	}

}
