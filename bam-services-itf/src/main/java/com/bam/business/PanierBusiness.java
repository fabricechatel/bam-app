package com.bam.business;

import java.util.List;

import com.bam.entity.Panier;

public interface PanierBusiness {

	public void sauvegarderPanier(Panier entity);
	public void effacerPanier(Panier entity);
	public Panier getPanierById(int entityID);
	
	public List<Panier> findAll();
	
	
}
