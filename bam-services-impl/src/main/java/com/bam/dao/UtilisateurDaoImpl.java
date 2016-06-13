package com.bam.dao;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Utilisateur;

@Component("utilisateurDao")
public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur, Integer>
		implements UtilisateurDao {
	Logger log = Logger.getLogger(getClass());
	
	
	public Utilisateur findByUserName(String login){
		Query q = em.createQuery("FROM Utilisateur WHERE LOGIN = :login" );
		q.setParameter("login", login);
		if (q.getResultList().isEmpty()){
			return null;
		}
		return (Utilisateur) q.getResultList().get(0);		
	}
}
