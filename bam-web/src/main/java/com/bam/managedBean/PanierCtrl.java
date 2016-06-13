package com.bam.managedBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Article;
import com.bam.entity.Client;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

@Component("panierCtrl")
public class PanierCtrl implements Serializable {




	private static final long serialVersionUID = 1L;
	
	@Autowired
	Facade facade;
	
	int ClientId = 0;
	


	public Panier getPanier() {
		return facade.getPanierBusiness().getPanierById(ClientId);
	}

	public void setPanier(Panier panier) {
		for(LiensPanierArticle l:panier.getLiensPanierArticles())
		System.out.println("================>"+l.getQuantitepanier()+" ===== article"+ l.getArticle().toString());
		facade.getPanierBusiness().sauvegarderPanier(panier);
	}

	public List<LiensPanierArticle> getLiens() {
		return  new ArrayList<LiensPanierArticle>(facade.getPanierBusiness().getLiensPanierArticles(getPanier()));
	}
	
	public Set<LiensPanierArticle> getLiensValides() {
		return facade.getPanierBusiness().getLiensPanierArticlesValides(getPanier());
	}

	public void setLiens(Set<LiensPanierArticle> liens) {
		facade.getPanierBusiness().sauvegarderPanier(getPanier());
	}

	public BigDecimal getPrixTotalPanier(){
		BigDecimal total=BigDecimal.ZERO;
		for (LiensPanierArticle l: getLiens()){
			total = l.getPrixCummule().add(total);
		}
		return total;
	}
		
	public void deleteLien(LiensPanierArticle l){
		facade.getPanierBusiness().deleteLienPanierArticle(l);
	}
	
	public void updateLien(LiensPanierArticle l){
		facade.getPanierBusiness().updateLienPanierArticle(l);
	}
}
