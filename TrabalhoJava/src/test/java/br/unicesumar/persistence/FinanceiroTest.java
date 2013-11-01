package br.unicesumar.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import br.unicesumar.types.TipoPagamento;
public class FinanceiroTest {
	private Recebimento r=new Recebimento();
	private Financeiro f=new Financeiro();
	
	@Test
	public void testFinancaTotal() {
		iniciarFinanceiro();

		assertEquals(9.0, f.getFinancaTotal(),0);
		
		r.setValorRecebido(2);
		f.setFinancaTotal(r.getValorRecebido()-r.getValorTroco());
		assertNotEquals(9.0, f.getFinancaTotal(),0);
	}
	
	@Test
	public void testTipoPagamento(){
		r.setTipoPagamento(TipoPagamento.AVISTA);
		assertEquals(TipoPagamento.AVISTA, r.getTipoPagamento());
	}

	public void iniciarFinanceiro(){
		this.r.setValorRecebido(10);
		this.r.setValorTroco(1);
		this.f.setRecebimento(r);
		this.f.setFinancaTotal(r.getValorRecebido()-r.getValorTroco());
	}
}
