package br.agrego.ws.logistica.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("logistica-mysql");

	public EntityManager getEntityManager() {
	    return entityManagerFactory.createEntityManager();
	}
}
