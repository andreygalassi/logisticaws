package br.agrego.ws.logistica.ws;

import br.agrego.ws.logistica.dao.MapaDao;
import br.agrego.ws.logistica.domain.Mapa;

public class PublicaWebService {

	public static void main(String[] args) {
//		MalhaWS ws = new MalhaWS();
//		
//		String url = "http://localhost:8080/logisticaws";
//		
//		Endpoint.publish(url, ws);
		
		Mapa malha = new Mapa();
		
		MapaDao dao = new MapaDao();
		malha=dao.load(Mapa.class, 2l);
		dao.delete(Mapa.class,3l);
		
//		dao.insert(malha);
//
//		List<Malha> lista = dao.findAll(Malha.class);
//		
//		System.out.println(lista);
		
		
//		EntityManager em = new JPAUtil().getEntityManager();
//		em.getTransaction().begin();
//
//		em.persist(malha);
//
//		em.getTransaction().commit();
//		em.close();
	}
}
