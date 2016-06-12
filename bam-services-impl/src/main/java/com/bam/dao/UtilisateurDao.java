package com.bam.dao;

import com.bam.entity.Utilisateur;

public interface UtilisateurDao extends GenericDao<Utilisateur, Integer> {

	public Utilisateur findByUserName(String login);
}
