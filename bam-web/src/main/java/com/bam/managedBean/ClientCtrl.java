package com.bam.managedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Adresse;
import com.bam.entity.Client;
import com.bam.entity.Role;
import com.bam.entity.Utilisateur;

@ManagedBean
@Component("clientCtrl")
@Scope("request")
public class ClientCtrl implements Serializable {


	private static final long serialVersionUID = 1L;

	@Autowired
	Facade facade;

	private String civilite;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mdp;
	private String roleClient;
	private String numero;
	private String voie;
	private String ville;
	private String cp;

	private Client clientACreer = new Client();

	private String messageAjoutClient="Client peut pas ajouté";

	@PostConstruct
	public void init(){
		clientACreer.setUtilisateur(new Utilisateur());
	}

	public Facade getFacade() {
		return facade;
	}
	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getRoleClient() {
		return roleClient;
	}
	public void setRoleClient(String roleClient) {
		this.roleClient = roleClient;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public Client getClientACreer() {
		return clientACreer;
	}
	public void setClientACreer(Client clientACreer) {
		this.clientACreer = clientACreer;
	}

	public void saveClient(){
		if (clientACreer != null) {
			Utilisateur nouveauUtilisateur = new Utilisateur(login, mdp);
			//nouveauUtilisateur.setRole(new Role("Client"));
			clientACreer.setUtilisateur(nouveauUtilisateur);
			Client newClient = facade.saveClient(clientACreer);
			if (newClient != null) {
               messageAjoutClient = "Nouveau client bien ajouté";
			}
		}
	}
}
