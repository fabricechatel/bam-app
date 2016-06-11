package com.bam.managedBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Article;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

@Component("panierCtrl")
public class PanierCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	Facade facade;

	public Panier getPanier(int entityID) {
		return facade.getPanierBusiness().getPanierById(entityID);
	}
	
	public Set<Article> getPanierArticles(int entityID){
		return facade.getPanierBusiness().getPanierArticles(entityID);
	}
	
	public Set<LiensPanierArticle> getLiensPanierArticles(int panierID){
		return facade.getPanierBusiness().getLiensPanierArticles(panierID);
	}
	
	
	public BigDecimal getPrixTotalPanier(int panierID){
		BigDecimal total=BigDecimal.ZERO;
		for (LiensPanierArticle l: getLiensPanierArticles(panierID)){
			total = l.getPrixCummule().add(total);
		}
		return total;
	}
	
	public void updateQuantite(int lienPAID , int qte){
		facade.getPanierBusiness().updateQuantiteLienPanierArticle(lienPAID, qte);
	}
}
