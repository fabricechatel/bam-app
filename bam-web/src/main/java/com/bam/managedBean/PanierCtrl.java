package com.bam.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Article;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

@Component("panierCtrl")
@Scope("request")
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
	
}
