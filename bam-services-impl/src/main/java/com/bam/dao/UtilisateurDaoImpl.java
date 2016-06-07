package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Utilisateur;

@Component("utilisateurDao")
public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur, Integer>
		implements UtilisateurDao {
	Logger log = Logger.getLogger(getClass());

}
