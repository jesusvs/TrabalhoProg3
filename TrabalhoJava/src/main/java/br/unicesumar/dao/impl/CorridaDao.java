package br.unicesumar.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.unicesumar.dao.GenericHibernateDao;
import br.unicesumar.persistence.Corrida;
import br.unicesumar.persistence.Motorista;

public class CorridaDao extends GenericHibernateDao<Corrida, Long>{

	public List<Corrida> pesquisarCorrida(String nome) {
		Criteria criteria = getSession().createCriteria(Corrida.class);
		if (nome != "") {
		    criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
		}
		return criteria.list();
	    }
}
