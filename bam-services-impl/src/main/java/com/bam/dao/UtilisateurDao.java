package com.bam.dao;

import com.bam.entity.Utilisateur;

public interface UtilisateurDao extends GenericDao<Utilisateur, Integer> {

	public Utilisateur authentification(String login, String pass);
	public Utilisateur findByUserName(String login);
}
