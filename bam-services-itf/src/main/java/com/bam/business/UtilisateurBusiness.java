package com.bam.business;

import com.bam.entity.Utilisateur;

public interface UtilisateurBusiness {
	
	public Utilisateur findByUserName(String username);
	public boolean userExists(String username);
}
