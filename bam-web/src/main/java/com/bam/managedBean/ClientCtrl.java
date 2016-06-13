package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Adresse;
import com.bam.entity.Client;
import com.bam.entity.Utilisateur;
import com.bam.entity.UtilisateurRole;

@ManagedBean
@Component("clientCtrl")
@Scope("request")
public class ClientCtrl implements Serializable {

	@Autowired
	Facade facade;
	
	@Autowired
	private LoginController lc;
	
	private Client clientACreer = new Client();
	private Utilisateur utilisateurACreer = new Utilisateur();
	private UtilisateurRole utilisateurRoleACreer = new UtilisateurRole();
	private Utilisateur utilisateurDejaExiste;
	private Utilisateur utilisateurCurrent;
	private int idUtilisateur;
	
	private boolean agree;
	
	private String messageAjoutClient="";

	public Facade getFacade() {
		return facade;
	}
	public void setFacade(Facade facade) {
		this.facade = facade;
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
	
	public LoginController getLc() {
		return lc;
	}
	public void setLc(LoginController lc) {
		this.lc = lc;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public void saveClientEtUtilisateur() {
		if (agree == true) {
			utilisateurDejaExiste = facade.getUtilisateurBusiness().findUtilisateurByLogin(utilisateurACreer.getLogin());
			if (utilisateurDejaExiste == null) {
				utilisateurRoleACreer.setEnabled(true);
				utilisateurRoleACreer.setNomrole("ROLE_CLIENT");

				utilisateurACreer.setEnable(true);
				utilisateurRoleACreer.setUtilisateur(utilisateurACreer);
				utilisateurACreer.getUtilisateurRoles().add(utilisateurRoleACreer);

				Utilisateur u =	facade.getUtilisateurBusiness().sauvegarderUtilisateur(utilisateurACreer);
				clientACreer.setUtilisateur(u);
				clientACreer.setEnabled(true);

				Client c = facade.getClientBusiness().sauvegarderClient(clientACreer);
				if (c != null) {
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

