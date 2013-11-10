package br.unicesumar.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.unicesumar.dao.GenericHibernateDao;
import br.unicesumar.persistence.Pessoa;

public class PessoaDao extends GenericHibernateDao<Pessoa, Long>{

	public List<Pessoa> pesquisarPessoaPorNome(String nome) {
		Criteria criteria = getSession().createCriteria(Pessoa.class);
		if (nome != "") {
		    criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
		}
		return criteria.list();
	    }
}
