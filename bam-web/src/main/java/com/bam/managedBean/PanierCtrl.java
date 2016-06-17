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

import com.bam.business.Facade;
import com.bam.entity.Client;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.LiensPanierArticlePK;
import com.bam.entity.Panier;


@ManagedBean(name="panierCtrl")
@SessionScoped
public class PanierCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{facadeImpl}")
	private Facade facade;
	
	

	private Client client;
	private List<LiensPanierArticle> listePanier;
	private Panier panier;
	
//	private String idSession;
	//	private String cookie;
	
	public Facade getFacade() {
		return facade;
	}
	
	public void setFacade(Facade facade) {
		this.facade = facade;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
		System.out.println("setClient ---------------->");
		if (this.client != null){
			
			panier = facade.getPanierBusiness().getPanierByClientId(client.getIdClient());
			System.out.println("panier ---------------->"+panier.getIdpanier());
			listePanier = new ArrayList<>(panier.getLiensPanierArticles());
			System.out.println("listePanier ---------------->"+listePanier.size());
		}
	}
	
	public Panier getPanier() {	
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	public List<LiensPanierArticle> getListePanier() {
		return listePanier;
	}

	public void setListePanier(List<LiensPanierArticle> listePanier) {
		this.listePanier = listePanier;
	}

	@PostConstruct
	public void init() {		
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		if (request.getRemoteUser() != null){			
			if (facade != null) {
				
				System.out.println("Client ---------------->"+client.getIdClient());
				panier = facade.getPanierBusiness().getPanierByClientId(client.getIdClient());
				System.out.println("par client" );
				
			}
		} 
		
//		else {
//		
//		
//			idSession=request.getSession().getId();
//			System.out.println("Session ###########################> "+idSession);
//			
//			
//			System.out.println("par cookie" );
//			
//			
////			if(cookie==null) {
////				createPanier(idSession);		
////				this.setCookie(idSession);
////				panier = facade.getPanierBusiness().getPanierByCookie(this.getCookie());
////			}
//			
//		}
		
		if (panier == null){
			panier = new Panier();
		}
		
		listePanier = new ArrayList<>(panier.getLiensPanierArticles());
		System.out.println("new listePanier");
	}
	
	private HttpServletRequest getRequest() {
		return (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
	
//	public String getCookie() {
//		return cookie;
//	}
//
//	public void setCookie(String cookie) {
//		this.cookie = cookie;
//	}

	


//	public List<LiensPanierArticle> getLiens() {
//		//return  facade.getPanierBusiness().getLiensPanierArticles(getPanier());
//		return panier.getLiensPanierArticles();
//	}
	
	
	public List<LiensPanierArticle> getLiensValides() {
		return facade.getPanierBusiness().getLiensPanierArticlesValides(panier);
	}

	public void setLiens(Set<LiensPanierArticle> liens) {
		facade.getPanierBusiness().sauvegarderPanier(panier);
	}

	public BigDecimal getPrixTotalPanier(){
		BigDecimal total=BigDecimal.ZERO;
		for (LiensPanierArticle l: listePanier){
			total = l.getPrixCummule().add(total);
		}
		return total;
	}	

	public void updatePanier(Panier p){
		p = getPanier();
		System.out.println("CTRL++++++++++++++++++++=====>>"+ p);
		facade.getPanierBusiness().sauvegarderPanier(p);	
	}	

	public void createPanier(String ref){
		facade.getPanierBusiness().creerPanier(ref);
	}

	
	public void deleteLien(LiensPanierArticle l){
		System.out.println("delete ---------------->"+l);
		if (getRequest().getRemoteUser() != null){
			facade.getPanierBusiness().deleteLienPanierArticle(l);
		}
		listePanier.remove(l);
//		init();
	}
	
	public void updateLien(LiensPanierArticle l){
		System.out.println("CTRL++++++++++++++++++++=====>>"+l);
		if (getRequest().getRemoteUser() != null){
			facade.getPanierBusiness().updateLienPanierArticle(l);
		}
		listePanier.set(listePanier.indexOf(l), l);
//		init();		
	}
	
	public void ajouterAuPanier(int idArticle) {
		System.out.println("Id "+idArticle);
		for (LiensPanierArticle e : listePanier) {
			if (e.getArticle().getIdArticle() == idArticle) {
				e.setQuantitepanier( e.getQuantitepanier() + 1 );
				if (getRequest().getRemoteUser() != null){
					updateLien(e);
				}
				return;
			}
		}		
		LiensPanierArticle lien = new LiensPanierArticle(1, facade.getArticleBusiness().ChercherArticleParId(idArticle), panier);
		System.out.println(lien);
		
		System.out.println("save=======================1");
		if (getRequest().getRemoteUser() != null){
			LiensPanierArticlePK pk =new LiensPanierArticlePK();
			pk.setIdArticle(idArticle);
			pk.setIdpanier(panier.getIdpanier());
			lien.setId(pk);
			facade.getPanierBusiness().saveLienPanierArticle(lien);
//			init();
		}
		listePanier.add(lien);
		System.out.println("save=======================2");
		
		
		
	}
	
//    public List getCookies() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        Map cookieMap = context.getExternalContext().getRequestCookieMap();
//        return new ArrayList(cookieMap.values());
//    }
	
}
