package com.bam.business;

import java.util.List;

import com.bam.entity.Fiche;

public interface FicheBusiness {

	public void creerFiche(Fiche fiche);
	Fiche modifierFiche(Fiche fiche);
	Fiche RechercherFicheParIdArticle(int id_Article);
	
	List<Fiche> RechercherToutesLesFiches();
}
