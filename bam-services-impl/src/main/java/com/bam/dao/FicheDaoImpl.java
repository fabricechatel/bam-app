package com.bam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Fiche;

@Component("ficheDao")
public class FicheDaoImpl extends GenericDaoImpl<Fiche, Integer> implements FicheDao {
	Logger log = Logger.getLogger(getClass());
	
	@Override
	public Fiche findByIdArticle(Integer Id_art) {
		Query query = em.createQuery("SELECT f FROM Fiche f WHERE f.idArticle =?").setParameter(1, Id_art);
		List<Fiche> fiches = query.getResultList();
		
		Fiche fiche = fiches.get(0); 
		
		return fiche;
	}
}
