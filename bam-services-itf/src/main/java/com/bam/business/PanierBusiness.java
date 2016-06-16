package com.bam.business;

import java.util.List;

import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

public interface PanierBusiness {

	public void sauvegarderPanier(Panier entity);
	public void effacerPanier(Panier entity);
	public Panier getPanierById(int idPanier );
	public List<LiensPanierArticle> getLiensPanierArticles(Panier panier);
	public void deleteLienPanierArticle(LiensPanierArticle lien);
	public void updateLienPanierArticle(LiensPanierArticle lien);
	public List<LiensPanierArticle> getLiensPanierArticlesValides(Panier panier);
	public Panier getPanierByClientId(int idClient);
	public Panier getPanierByCookie(String cookie);
	public void creerPanier(String ref);
	public void saveLienPanierArticle(LiensPanierArticle lien);
	
}
