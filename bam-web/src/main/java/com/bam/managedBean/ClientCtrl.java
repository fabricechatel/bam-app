package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;












import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

//import javax.inject.Inject;
//import javax.inject.Named;










import com.bam.business.Facade;
import com.bam.entity.Adresse;
import com.bam.entity.Client;
import com.bam.entity.Panier;
import com.bam.entity.Utilisateur;
import com.bam.entity.UtilisateurRole;
import com.bam.security.LoginServiceImpl;

@ManagedBean(name="clientCtrl")
@Scope("request")
public class ClientCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	private Client client;

	@ManagedProperty(value="#{facadeImpl}")
	private Facade facade;
	
//	@ManagedProperty(value="#{loginServiceImpl}")
//	private UserDetailsService login;
	
	private Client clientACreer = new Client();
	private Utilisateur utilisateurACreer = new Utilisateur();
	private UtilisateurRole utilisateurRoleACreer = new UtilisateurRole();
	private Utilisateur utilisateurDejaExiste;
	private Utilisateur utilisateurCurrent;
	private int idUtilisateur;
	
	private boolean agree;
	
	private String messageAjoutClient="";
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}	

	@PostConstruct
	public void postConstruct(){
        init();
	}
	
	public void init(){
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		if (request.getRemoteUser() != null){
			client = new Client();
			if (facade != null) {
				Utilisateur u = facade.getUtilisateurBusiness().findByUserName(request.getRemoteUser());
				if ((u != null) && (u.getClient() != null)){
					client = u.getClient();
					Panier panier = facade.getPanierBusiness().getPanierByClientId(client.getIdClient());
					System.out.println(panier);
					if (panier == null){
						facade.getPanierBusiness().sauvegarderPanier(new Panier(request.getSession().getId(), client));
					}
				}
			}
		} 
//		else {
//			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	        if (auth.isAuthenticated()) {  
//	            System.out.println("auth.isAuthenticated() : " + auth.getName() + " " + auth.getAuthorities().toString()); 
//	        } else {
//	        	System.out.println("auth.isAuthenticated() not ");
//	        }
//		}
	}
	
	public void setcookies(){
		System.out.println("par ici les cookies");
	}
	
	public Client getClientACreer() {
		return clientACreer;
	}
    public void setClientACreer(Client clientACreer) {
		this.clientACreer = clientACreer;
	}

	public Utilisateur getUtilisateurACreer() {
		return utilisateurACreer;
	}
	public void setUtilisateurACreer(Utilisateur utilisateurACreer) {
		this.utilisateurACreer = utilisateurACreer;
	}

	public UtilisateurRole getUtilisateurRoleACreer() {
		return utilisateurRoleACreer;
	}
	public void setUtilisateurRoleACreer(UtilisateurRole utilisateurRoleACreer) {
		this.utilisateurRoleACreer = utilisateurRoleACreer;
	}
	
	public String getMessageAjoutClient() {
		return messageAjoutClient;
	}
	public void setMessageAjoutClient(String messageAjoutClient) {
		this.messageAjoutClient = messageAjoutClient;
	}
	
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	
	public Utilisateur getUtilisateurDejaExiste() {
		return utilisateurDejaExiste;
	}
	public void setUtilisateurDejaExiste(Utilisateur utilisateurDejaExiste) {
		this.utilisateurDejaExiste = utilisateurDejaExiste;
	}
	
	public Utilisateur getUtilisateurCurrent() {
		return utilisateurCurrent;
	}
	public void setUtilisateurCurrent(Utilisateur utilisateurCurrent) {
		this.utilisateurCurrent = utilisateurCurrent;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public void saveClientEtUtilisateur() {
		System.out.println("par ici");
		if (agree == true) {
			utilisateurDejaExiste = facade.getUtilisateurBusiness().findByUserName(utilisateurACreer.getLogin());
			if (utilisateurDejaExiste == null) {
				utilisateurRoleACreer.setEnabled(true);
				utilisateurRoleACreer.setNomrole("ROLE_CLIENT");

				utilisateurACreer.setEnable(true);
				utilisateurRoleACreer.setUtilisateur(utilisateurACreer);
				utilisateurACreer.getUtilisateurRoles().add(utilisateurRoleACreer);

				facade.getUtilisateurBusiness().sauvegarderUtilisateur(utilisateurACreer);
				clientACreer.setUtilisateur(utilisateurACreer);
				clientACreer.setEnabled(true);
                System.out.println("util--------------"+utilisateurACreer);
				facade.getClientBusiness().sauvegarderClient(clientACreer);
				System.out.println("cli---------------"+clientACreer);
				if (clientACreer.getIdClient() != 0) {
					messageAjoutClient = "Client bien ajouté";
				}
			}
		}
	}
	
	public void updateClientEtUtilisateur() {
		utilisateurACreer.setEnable(true);

		Utilisateur u =	facade.getUtilisateurBusiness().modifierUtilisateur(utilisateurACreer);
	    clientACreer.setUtilisateur(u);
	    clientACreer.setEnabled(true);

		Client c = facade.getClientBusiness().modifierClient(clientACreer);
		if (c != null) {
			messageAjoutClient = "Client bien ajouté";
		}
		else {
			messageAjoutClient = "Client n'est pas ajouté";
		}
	}
}
