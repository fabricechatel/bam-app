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
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Client;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;
import com.bam.entity.Utilisateur;


@ManagedBean(name="panierCtrl")
@SessionScoped
public class PanierCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{facadeImpl}")
	private Facade facade;
	private Client client;
	private List<LiensPanierArticle> listePanier;
	@PostConstruct
	public void init() {
		
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		if ((request.getRemoteUser() != null) && (client == null)){
			client = new Client();
			if (facade != null) {
				Utilisateur u = facade.getUtilisateurBusiness().findByUserName(request.getRemoteUser());
				if ((u != null) && (u.getClient() != null)){
					client = u.getClient();
				}
			}
		}
		
		
		listePanier = new ArrayList<>(getPanier().getLiensPanierArticles());
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Facade getFacade() {
		return facade;
	}
	
	public void setFacade(Facade facade) {
		this.facade = facade;
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


	public Panier getPanierByClientId(int idClient){
		return facade.getPanierBusiness().getPanierByClientId(idClient);
	}
	
}
