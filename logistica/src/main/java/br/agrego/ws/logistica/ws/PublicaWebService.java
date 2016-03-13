package br.agrego.ws.logistica.ws;

import br.agrego.ws.logistica.dao.MalhaDao;
import br.agrego.ws.logistica.domain.Malha;

public class PublicaWebService {

	public static void main(String[] args) {
//		MalhaWS ws = new MalhaWS();
//		
//		String url = "http://localhost:8080/logisticaws";
//		
//		Endpoint.publish(url, ws);
		
		Malha malha = new Malha();
		
		MalhaDao dao = new MalhaDao();
		malha=dao.load(Malha.class, 2l);
		dao.delete(Malha.class,3l);
		
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
