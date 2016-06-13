package com.bam.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class GenericDaoImpl<T,ID extends Serializable> implements GenericDao<T,ID> {

	 	@PersistenceContext
	    protected EntityManager em;

	    private Class<T> type;

	    public GenericDaoImpl() {
	        Type t = getClass().getGenericSuperclass();
	        ParameterizedType pt = (ParameterizedType) t;
	        type = (Class) pt.getActualTypeArguments()[0];
	    }
	    
	    @PersistenceContext(unitName="entityManagerFactory")
		public void setEntityManager(EntityManager entityManager) {
			this.em = entityManager;
		}
		
		@Override
		public void save(T entity) {
			System.out.println("save");
			em.persist(entity);
			em.flush();		
		}

		@Override
		public void delete(T entity) { 
			System.out.println("delete"+entity.toString());
			T toRemoved = em.merge(entity);
			em.remove(toRemoved);		
		}

		@Override
		public T find(ID entityID) {
			return em.find(type, entityID);
		}

		@Override
		public List<T> findAll() {
			Query q = em.createQuery(" FROM " + type.getSimpleName());
			return q.getResultList();
		}

		@Override
		public T update(T entity) {
			return em.merge(entity);
		}
}
