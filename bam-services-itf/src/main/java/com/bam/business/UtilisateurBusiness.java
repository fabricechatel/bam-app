package com.bam.business;

import com.bam.entity.Utilisateur;

public interface UtilisateurBusiness {
	
	Utilisateur findByUserName(String username);
}
