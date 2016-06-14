package com.bam.business;


import com.bam.entity.Utilisateur;

public interface UtilisateurBusiness {
	
	public Utilisateur findByUserName(String username);
	public boolean userExists(String username);
	
	
	public void sauvegarderUtilisateur(Utilisateur user);
	public Utilisateur modifierUtilisateur(Utilisateur user);
	public void effacerUtilisateur(Utilisateur user);
	public Utilisateur getUtilisateurById(int userID);
}
