package br.agrego.ws.logistica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.agrego.ws.logistica.util.JPAUtil;

public class Dao<T> {

	private final EntityManager entityManager;

	public Dao() {
		entityManager = new JPAUtil().getEntityManager();
	}
	
	public void insert(final T entity) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(entity);
		getEntityManager().getTransaction().commit();
	}

	public void delete(Class<T> clazz, Long id) {
		getEntityManager().getTransaction().begin();
		T entity = getEntityManager().find(clazz, id);
		getEntityManager().remove(entity);
		getEntityManager().getTransaction().commit();
	}

	public void update(final T entity) {
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
	}

	public T load(Class<T> clazz, Long id) {
		return getEntityManager().find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz) {
		return (List<T>) findByJPQL(clazz, "select this from " + clazz.getSimpleName() + " this");
	}

	protected List<?> findByJPQL(Class<T> clazz, String jpql) {
		TypedQuery<T> listQuery = getEntityManager().createQuery(jpql, clazz);

		return listQuery.getResultList();
	}
	
	protected Query createQuery(final String ql) {
		return getEntityManager().createQuery(ql);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
