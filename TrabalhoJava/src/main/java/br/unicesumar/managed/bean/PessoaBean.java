package br.unicesumar.managed.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.unicesumar.persistence.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaBean {
	private Pessoa pessoa = new Pessoa();
	
	private PessoaDao dao = new UsuarioDao();

}
