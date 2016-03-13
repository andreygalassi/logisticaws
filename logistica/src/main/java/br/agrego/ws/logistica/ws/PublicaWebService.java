package br.agrego.ws.logistica.ws;

import javax.persistence.EntityManager;

import br.agrego.ws.logistica.domain.Malha;
import br.agrego.ws.logistica.util.JPAUtil;

public class PublicaWebService {

	public static void main(String[] args) {
//		MalhaWS ws = new MalhaWS();
//		
//		String url = "http://localhost:8080/logisticaws";
//		
//		Endpoint.publish(url, ws);
		
		Malha malha = new Malha();
		malha.setTeste("teste");

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.persist(malha);

		em.getTransaction().commit();
		em.close();
	}
}
