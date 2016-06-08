package com.bam.business;

import com.bam.entity.Utilisateur;

public interface UtilisateurBusiness {
	
	Utilisateur Login(String login, String pass);
}
