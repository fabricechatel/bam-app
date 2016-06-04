package com.bam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bam.entity.Client;

@Transactional
@Component("clientDao")
public class ClientDaoImpl implements ClientDao {
	
	Logger log = Logger.getLogger(getClass());
	
	protected EntityManager em;

	@PersistenceContext(unitName="entityManagerFactory")
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	@Override
	public void save(Client entity) {
		em.persist(entity);
		em.flush();		
	}

	@Override
	public void delete(Client entity) { 
		Client toRemoved = em.merge(entity);
		em.remove(toRemoved);		
	}

	@Override
	public Client find(int entityID) {
		return em.find(Client.class, entityID);
	}

	@Override
	public List<Client> findAll() {
		Query q = em.createQuery("FROM Client");
		return (List<Client>) q.getResultList();
	}

	@Override
	public Client update(Client entity) {
		return em.merge(entity);
	}
}
