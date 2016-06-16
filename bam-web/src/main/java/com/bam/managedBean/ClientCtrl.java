package com.bam.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Adresse;
import com.bam.entity.Client;
import com.bam.entity.Utilisateur;
import com.bam.entity.UtilisateurRole;

@ManagedBean(name="clientCtrl")
@RequestScoped
public class ClientCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	private Client client;
	private String password;
	private String passwordConfirm;
	private int idShippingAddress;
	
	private UIComponent success;

	@ManagedProperty(value="#{facadeImpl}")
	private Facade facade;
	
	@ManagedProperty(value = "#{panierCtrl}")
	PanierCtrl panier;

	private Client clientACreer = new Client();
	private Utilisateur utilisateurACreer = new Utilisateur();
	private UtilisateurRole utilisateurRoleACreer = new UtilisateurRole();
	private Adresse adresseClient = new Adresse();
	private Utilisateur utilisateurDejaExiste;
	
	private Map<Integer, Boolean> checked = new HashMap<Integer, Boolean>();
	
	public Map<Integer, Boolean> getChecked() {
		return checked;
	}

	public void setChecked(Map<Integer, Boolean> checked) {
		this.checked = checked;
	}

	private List<Adresse> listeAdresse = new ArrayList<Adresse>();

	private boolean agree;

	//private String messageAjoutClient="";
	//private String messageModifClient="";

	@PostConstruct
	public void postConstruct(){
		init();
	}

	public void init(){
		System.out.println(facade);
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		if ((request.getRemoteUser() != null) && (client == null)){
			client = new Client();
			if (facade != null) {
				Utilisateur u = facade.getUtilisateurBusiness().findByUserName(request.getRemoteUser());
				if ((u != null) && (u.getClient() != null)){
					client = u.getClient();
					panier.setClient(client);
					if (client.getFirstAdresse() != null) {
						adresseClient = client.getFirstAdresse();
					}
					if (client.getAdresses() != null) {
						listeAdresse.addAll(client.getAdresses());
					}
				}
			}
		}	
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
	
	public Adresse getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(Adresse adresseClient) {
		this.adresseClient = adresseClient;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

//	public String getMessageAjoutClient() {
//		return messageAjoutClient;
//	}
//	public void setMessageAjoutClient(String messageAjoutClient) {
//		this.messageAjoutClient = messageAjoutClient;
//	}
//
//	public String getMessageModifClient() {
//		return messageModifClient;
//	}
//	public void setMessageModifClient(String messageModifClient) {
//		this.messageModifClient = messageModifClient;
//	}
	public int getIdShippingAddress() {
		return idShippingAddress;
	}
	public void setIdShippingAddress(int idShippingAddress) {
		this.idShippingAddress = idShippingAddress;
	}

	public List<Adresse> getListeAdresse() {
		return listeAdresse;
	}
	public void setListeAdresse(List<Adresse> listeAdresse) {
		this.listeAdresse = listeAdresse;
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

	public UIComponent getSuccess() {
		return success;
	}
	public void setSuccess(UIComponent success) {
		this.success = success;
	}
	
	public void saveClientEtUtilisateur() {
		
		if (!password.equals(passwordConfirm)) {
			FacesMessage message = new FacesMessage("Confirmation mot de passe erronée");
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(success.getClientId(context), message);
            return;
		}
		if (agree == true) {
			utilisateurDejaExiste = facade.getUtilisateurBusiness().findByUserName(utilisateurACreer.getLogin());
			if (utilisateurDejaExiste == null) {
				utilisateurRoleACreer.setEnabled(true);
				utilisateurRoleACreer.setNomrole("ROLE_CLIENT");
				
				utilisateurACreer.setEnable(true);
				utilisateurACreer.setMdp(password);
				utilisateurRoleACreer.setUtilisateur(utilisateurACreer);
				utilisateurACreer.getUtilisateurRoles().add(utilisateurRoleACreer);

				facade.getUtilisateurBusiness().sauvegarderUtilisateur(utilisateurACreer);
				clientACreer.setUtilisateur(utilisateurACreer);
				clientACreer.setEnabled(true);
				facade.getClientBusiness().sauvegarderClient(clientACreer);
				if (clientACreer.getIdClient() != 0) {
					//messageAjoutClient = "Client bien ajouté";
		            FacesMessage message = new FacesMessage("Votre compte est bien été crée");
		            FacesContext context = FacesContext.getCurrentInstance();
		            context.addMessage(success.getClientId(context), message);
				}
			}
		}
	}

	public void updateClientEtUtilisateur() {
		if (!password.isEmpty()) {
			if (!password.equals(passwordConfirm)) {
				FacesMessage message = new FacesMessage("Confirmation mot de passe erronée");
	            FacesContext context = FacesContext.getCurrentInstance();
	            context.addMessage(success.getClientId(context), message);
	            return;
			}
			client.getUtilisateur().setMdp(password);
		}
		if (client.getAdresses().isEmpty()) { 
			//Adresse a = new Adresse();
			//BeanUtils.copyProperties(a, adresseClient);
			client.getAdresses().add(adresseClient);
			adresseClient.getClients().add(client);
		} else {
			//client.getFirstAdresse().setNumero(adresseClient.getNumero());
			BeanUtils.copyProperties(client.getFirstAdresse(), adresseClient);
		}
		
		facade.getUtilisateurBusiness().modifierUtilisateur(client.getUtilisateur());
		facade.getClientBusiness().modifierClient(client);
		//messageModifClient = "Client bien modifié";
        FacesMessage message = new FacesMessage("Votre compte est bien été modifié");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(success.getClientId(context), message);
	}
	
	public void afficheAdresseSelectionne() {
		
		
	    System.out.println(idShippingAddress);
	    
//	    System.out.println(id);
//        for(Adresse a : listeAdresse) {
//            if (a.getIdAdresse() == idShippingAddress) {
//                System.out.println("Adress selected"+a.getIdAdresse());
//            }
//        }
	}
	
	
}
