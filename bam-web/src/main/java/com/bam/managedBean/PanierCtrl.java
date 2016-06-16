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
import com.bam.entity.Utilisateur;


@ManagedBean(name="panierCtrl")
@SessionScoped
public class PanierCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{facadeImpl}")
	Facade facade;
	Client client;
	private String cookie;
	List<LiensPanierArticle> listePanier;
	private String idSession;
	Panier panier;
	HttpServletRequest request;
	


	@PostConstruct
	public void init() {
		
		//client.setIdClient(3);  ///// test
		
		request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		if ((request.getRemoteUser() != null) && (client == null)){
			client = new Client();
			
			if (facade != null) {
				Utilisateur u = facade.getUtilisateurBusiness().findByUserName(request.getRemoteUser());
				System.out.println("Utilisateur ---------------->"+u);
				if ((u != null) && (u.getClient() != null)){
					client = u.getClient();
					client.setIdClient(3);  ///// test
					System.out.println("Client ---------------->"+client);
					panier = facade.getPanierBusiness().getPanierByClientId(client.getIdClient());
					
					System.out.println("par client" );
					
				}
			}
		} else {
		
		
			idSession=request.getSession().getId();
			System.out.println("Session ###########################> "+idSession);
			
			
			System.out.println("par cookie" );
			
			
			if(cookie==null) {
				createPanier(idSession);		
				this.setCookie(idSession);
				panier = facade.getPanierBusiness().getPanierByCookie(this.getCookie());
			}
		}
		
		
		
		listePanier = new ArrayList<>(getPanier().getLiensPanierArticles());
		
		
	}
	
	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public Panier getPanier() {	
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
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

	public void updatePanier(Panier p){
		p = getPanier();
		System.out.println("CTRL++++++++++++++++++++=====>>"+ p);
		facade.getPanierBusiness().sauvegarderPanier(p);	
	}

	public List<LiensPanierArticle> getListePanier() {
		return listePanier;
	}

	public void setListePanier(List<LiensPanierArticle> listePanier) {
		this.listePanier = listePanier;
	}

	public void createPanier(String ref){
		facade.getPanierBusiness().creerPanier(ref);
	}
	
	

	public void ajouterAuPanier(int idArticle) {
		
		for (LiensPanierArticle e : getLiens()){
			if (e.getArticle().getIdArticle() == idArticle){
				e.setQuantitepanier( e.getQuantitepanier() + 1 );
				System.out.println("update=======================1");
				updateLien(e);
				System.out.println("update=======================2");
				return;
			}
		}
		LiensPanierArticlePK pk =new LiensPanierArticlePK();
		pk.setIdArticle(idArticle);
		pk.setIdpanier(panier.getIdpanier());
		LiensPanierArticle lien = new LiensPanierArticle(1, facade.getArticleBusiness().ChercherArticleParId(idArticle), panier);
		lien.setId(pk);
		System.out.println("save=======================1");
		facade.getPanierBusiness().saveLienPanierArticle(lien);
		System.out.println("save=======================2");
		init();
		
		
	}
	
//    public List getCookies() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        Map cookieMap = context.getExternalContext().getRequestCookieMap();
//        return new ArrayList(cookieMap.values());
//    }
	
}
