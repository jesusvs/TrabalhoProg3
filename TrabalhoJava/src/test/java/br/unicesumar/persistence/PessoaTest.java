package br.unicesumar.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import br.unicesumar.dao.impl.PessoaDao;
import br.unicesumar.types.Sexo;

public class PessoaTest {
	Pessoa p=new Pessoa();
	PessoaDao pDao=new PessoaDao();
	
	@Test
	public void testarAtributosPessoa() {
		assertEquals(this.p.getNome().equals("Washington"),true);
		assertFalse("Errado",this.p.getCpf().equals("123456789-01"));
		assertEquals(this.p.getIdade()==23,true);
		assertFalse("Errado",this.p.getSexo().equals(Sexo.FEMININO));
	}
	
	@Test
	public void testarCrudPessoa(){
		this.pDao.save(p);
		this.p.setCpf("123213912");
		this.pDao.save(p);
		this.pDao.delete(p);
	}
	
	@Before
	public void iniciarPessoa(){
		this.p.setNome("Washington");
		this.p.setCpf("123456789-00");
		this.p.setIdade(23);
		this.p.setSexo(Sexo.MASCULINO);
	}
}
