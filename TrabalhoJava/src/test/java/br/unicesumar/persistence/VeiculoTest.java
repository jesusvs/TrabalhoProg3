package br.unicesumar.persistence;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unicesumar.types.TipoPagamento;
import br.unicesumar.types.TipoVeiculo;
import br.unicesumar.utils.Marca;

public class VeiculoTest {
	private Carro c = new Carro();
	private Recebimento r = new Recebimento();

	@Test
	public void testVeiculo() {
		iniciarRecebimento();
		iniciarVeiculo();
		assertNotEquals("Opalla", c.getNomeVeiculo());
		assertEquals(Marca.CHEVROLET, c.getMarca());
		assertNotEquals("QWE-9876", c.getPlaca());
		assertEquals(TipoVeiculo.SEDAN, r.getVeiculo().getTipoVeiculo());
		assertNotEquals(TipoPagamento.AVISTA, c.getRecebimento().get(0)
				.getTipoPagamento());
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
