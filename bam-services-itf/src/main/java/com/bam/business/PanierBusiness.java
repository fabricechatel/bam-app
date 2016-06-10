package com.bam.business;

import java.util.List;
import java.util.Set;

import com.bam.entity.Article;
import com.bam.entity.Panier;

public interface PanierBusiness {

	public void sauvegarderPanier(Panier entity);
	public void effacerPanier(Panier entity);
	public Panier getPanierById(int entityID);
	
	public List<Panier> findAll();
	public Set<Article> getPanierArticles(int entityID);
	
}
