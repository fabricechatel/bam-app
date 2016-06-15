package com.bam.dao;

import java.util.Set;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Article;
import com.bam.entity.Panier;

@Component("panierDao")
public class PanierDaoImpl extends GenericDaoImpl<Panier, Integer> implements PanierDao {

	
	Logger log = Logger.getLogger(getClass());
	
	public Panier getPanierByClientId(int idClient) {
		Query q = em.createQuery(" FROM Panier where ID_CLIENT = :id");
		q.setFirstResult(0);
		q.setMaxResults(1);
		q.setParameter("id", idClient);
		return (Panier) q.getResultList().get(0);

		}
	
	public Panier getPanierByCookie(String str) {
		Query q = em.createQuery(" FROM Panier where REFINTERNAUTE = :ref");
		q.setFirstResult(0);
		q.setMaxResults(1);
		q.setParameter("ref", str);
		return (Panier) q.getResultList().get(0);
	
		}

	
}
