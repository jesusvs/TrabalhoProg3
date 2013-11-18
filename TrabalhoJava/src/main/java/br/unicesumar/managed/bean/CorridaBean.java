package br.unicesumar.managed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.unicesumar.dao.impl.CorridaDao;
import br.unicesumar.persistence.Corrida;
import br.unicesumar.persistence.Veiculo;

@ManagedBean
public class CorridaBean {
	private Corrida corrida = new Corrida();
	private CorridaDao dao = new CorridaDao();
	private String nome = "";
	private List<Corrida> listagemDeCorrida = new ArrayList<Corrida>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Corrida getCorrida() {
		return corrida;
	}

	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}

	public CorridaDao getDao() {
		return dao;
	}

	public void setDao(CorridaDao dao) {
		this.dao = dao;
	}

	public List<Corrida> getListagemCorrida() {
		return listagemDeCorrida;
	}

	public void setListagemCorrida(List<Corrida> listagemDeCorrida) {
		this.listagemDeCorrida = listagemDeCorrida;
	}
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			String acao = (corrida.getId() != null ? "Alterado"
					: "Cadastrado");

			dao.save(corrida);

			nome = corrida.getDestinoCorrida();
			pesquisarCorrida();

			if (corrida.getId() != null) {
				context.addMessage(null,
						new FacesMessage(acao + " com sucesso"));
			} else {
				context.addMessage(null,
						new FacesMessage(acao + " com sucesso"));
			}
			return "corridaList";
		} catch (Exception e) {
			context.addMessage(null,
					new FacesMessage("Erro ao inserir: " + e.getMessage()));
			return "corrida";
		}
	}
	
	public void pesquisarCorrida() {
		listagemDeCorrida = dao.pesquisarCorrida(nome);
	}
	
	public String novaCorrida() {
		this.corrida = new Corrida();
		return "corrida";
	}

	public String editar(Corrida corrida) {
		this.corrida = corrida;
		return "corrida";
	}

	public void guardarSelecao(Corrida corrida) {
		this.corrida = corrida;
	}
	
	public String remover() {
		FacesContext context = FacesContext.getCurrentInstance();
		if (corrida == null) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_WARN,
					"nenhuma pessoa selecionada", ""));
			return "corridaList";
		}
		try {
			dao.delete(corrida);
			pesquisarCorrida();

			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO, "Removido com sucesso", ""));
		} catch (Exception e) {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Erro ao remover: " + e.getMessage(), ""));
		}
		return "corridaList";
	}
	
	public Integer getQuantidadeItensLista() {
		return listagemDeCorrida.size();
	}
}
