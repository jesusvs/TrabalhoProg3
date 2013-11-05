package br.unicesumar.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import br.unicesumar.types.Marca;
import br.unicesumar.types.TipoPagamento;
import br.unicesumar.types.TipoVeiculo;

public class VeiculoTest {
	private Carro c = new Carro();
	private Recebimento r = new Recebimento();

	@Test
	public void testVeiculo() {
		iniciarRecebimento();
		iniciarVeiculo();
		assertFalse("Errado", c.getNomeVeiculo().equals("Opalla"));
		assertEquals(Marca.CHEVROLET, c.getMarca());
		assertFalse("Errado", c.getPlaca().equals("QWE-9874"));
		assertEquals(TipoVeiculo.SEDAN, r.getVeiculo().getTipoVeiculo());
		assertFalse( c.getRecebimento().get(0)
				.getTipoPagamento()==TipoPagamento.AVISTA);
	}

	public void iniciarVeiculo() {
		this.c.setMarca(Marca.CHEVROLET);
		this.c.setNomeVeiculo("Omega");
		this.c.setPlaca("AAA-1234");
		iniciarRecebimento();
		this.c.setRecebimento(this.r);
		this.c.setTipoVeiculo(TipoVeiculo.SEDAN);
	}

	public void iniciarRecebimento() {
		this.r.setValorRecebido(54);
		this.r.setValorTroco(10.2);
		this.r.setTipoPagamento(TipoPagamento.CARTAO);
		this.r.setVeiculo(c);
	}
}
