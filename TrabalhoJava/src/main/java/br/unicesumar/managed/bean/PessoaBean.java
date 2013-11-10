package br.unicesumar.managed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.unicesumar.dao.impl.PessoaDao;
import br.unicesumar.persistence.Pessoa;
import br.unicesumar.types.Sexo;

@ManagedBean
public class PessoaBean {
	private Pessoa pessoa = new Pessoa();
	private PessoaDao dao = new PessoaDao();
	private String nome = "";
	private List<Pessoa> listagemDePessoa = new ArrayList<Pessoa>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaDao getDao() {
		return dao;
	}

	public void setDao(PessoaDao dao) {
		this.dao = dao;
	}

	public List<Pessoa> getListagemPessoa() {
		return listagemDePessoa;
	}

	public void setListagemPessoa(List<Pessoa> listagemDePessoa) {
		this.listagemDePessoa = listagemDePessoa;
	}
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			String acao = (pessoa.getId() != null ? "Alterado"
					: "Cadastrado");

			dao.save(pessoa);

			nome = pessoa.getNome();
			pesquisarPessoa();

			if (pessoa.getId() != null) {
				context.addMessage(null,
						new FacesMessage(acao + " com sucesso"));
			} else {
				context.addMessage(null,
						new FacesMessage(acao + " com sucesso"));
			}
			return "concessionariaList";
		} catch (Exception e) {
			context.addMessage(null,
					new FacesMessage("Erro ao inserir: " + e.getMessage()));
			return "concessionaria";
		}
	}
	
	public void pesquisarPessoa() {
		listagemDePessoa = dao.pesquisarPessoaPorNome(nome);
	}
	
	public String novaPessoa() {
		this.pessoa = new Pessoa();
		return "pessoa";
	}

	public String editar(Pessoa pessoa) {
		this.pessoa = pessoa;
		return "pessoa";
	}

	public void guardarSelecao(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String remover() {
		FacesContext context = FacesContext.getCurrentInstance();
		if (pessoa == null) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_WARN,
					"nenhuma pessoa selecionada", ""));
			return "concessionariaList";
		}
		try {
			dao.delete(pessoa);
			pesquisarPessoa();

			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO, "Removido com sucesso", ""));
		} catch (Exception e) {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Erro ao remover: " + e.getMessage(), ""));
		}
		return "pessoaList";
	}
	
	public Sexo[] getUfValues() {
		return Sexo.values();
	}
	
	public Integer getQuantidadeItensLista() {
		return listagemDePessoa.size();
	}
}
