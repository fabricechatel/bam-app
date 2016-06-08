package com.bam.dao;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Utilisateur;

@Component("utilisateurDao")
public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur, Integer>
		implements UtilisateurDao {
	Logger log = Logger.getLogger(getClass());
	
	@Override
	public Utilisateur authentification(String login, String pass) {
		Query q = em.createQuery("FROM Utilisateur WHERE LOGIN = :login AND MDP = :pass" );
		q.setParameter("login", login);
		q.setParameter("pass", pass);
		return (Utilisateur) q.getSingleResult();
	}
	
	public Utilisateur findByUserName(String login){
		Query q = em.createQuery("FROM Utilisateur WHERE LOGIN = :login" );
		q.setParameter("login", login);
		return (Utilisateur) q.getSingleResult();		
	}
}
