package com.bam.business;

import java.util.Set;

import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

public interface PanierBusiness {

	public void sauvegarderPanier(Panier entity);
	public void effacerPanier(Panier entity);
	public Panier getPanierById(int idPanier );
	public Set<LiensPanierArticle> getLiensPanierArticles(Panier panier);
	public void deleteLienPanierArticle(LiensPanierArticle lien);
	public void updateLienPanierArticle(LiensPanierArticle lien);
	public Set<LiensPanierArticle> getLiensPanierArticlesValides(Panier panier);
}
