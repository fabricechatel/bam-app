package com.bam.managedBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;


@ManagedBean(name="panierCtrl")
@SessionScoped
public class PanierCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{facadeImpl}")
	Facade facade;

	List<LiensPanierArticle> listePanier;
	@PostConstruct
	public void init() {
		listePanier = new ArrayList<>(getPanier().getLiensPanierArticles());
	}
	
	public Panier getPanier() {		
		return facade.getPanierBusiness().getPanierById(1);
	}

	public List<LiensPanierArticle> getLiens() {
		//return  facade.getPanierBusiness().getLiensPanierArticles(getPanier());
		return getPanier().getLiensPanierArticles();
	}
	
	
	public List<LiensPanierArticle> getLiensValides() {
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
		System.out.println(l.getId().getIdArticle());
		facade.getPanierBusiness().deleteLienPanierArticle(l);
		init();
	}
	
	public void updateLien(LiensPanierArticle l){
		System.out.println("CTRL++++++++++++++++++++=====>>"+l);
		System.out.println(l.getId().getIdArticle());
		facade.getPanierBusiness().updateLienPanierArticle(l);
		init();
	}
	
	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public void updatePanier(){
		Panier p = getPanier();
		System.out.println("CTRL++++++++++++++++++++=====>>"+ p);
		facade.getPanierBusiness().sauvegarderPanier(p);
	}

	public List<LiensPanierArticle> getListePanier() {
		return listePanier;
	}

	public void setListePanier(List<LiensPanierArticle> listePanier) {
		this.listePanier = listePanier;
	}


	
	
//	//sort by order no
//		public String sortByLiensPanierArticleId() {
//		    
//		   Collections.sort(orderArrayList, new Comparator<LiensPanierArticle>() {
//
//			@Override
//			public int compare(LiensPanierArticle o1, LiensPanierArticle o2) {
//						
//				return  o1.getId().compareTo(o2.getId();
//						
//			}
//		   });	
//		}
	
}
