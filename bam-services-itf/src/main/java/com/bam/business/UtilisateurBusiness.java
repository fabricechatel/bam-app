package com.bam.business;

import com.bam.entity.Utilisateur;

public interface UtilisateurBusiness {
	
	void register(Utilisateur user);
	Utilisateur findByUserName(String username);
}
