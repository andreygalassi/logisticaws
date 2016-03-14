package br.agrego.ws.logistica.dao;

import java.util.List;

import javax.persistence.Parameter;
import javax.persistence.Query;

import br.agrego.ws.logistica.domain.Mapa;

public class MapaDao extends Dao<Mapa> {

	public Mapa findByNome(String nomeMapa) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" select m from Mapa m ");
		sb.append(" where m.nome = :nomeMapa ");
		
		Query query = createQuery(sb.toString());

		for (Parameter<?> p : query.getParameters()) {
			if ("nomeMapa".equals(p.getName()))	{query.setParameter(p.getName(), nomeMapa);}
		}
		
		@SuppressWarnings("unchecked")
		List<Mapa> lista = query.getResultList();
		
		if (lista!=null && lista.size()>0) return lista.get(0);
		return null;
	}

}
