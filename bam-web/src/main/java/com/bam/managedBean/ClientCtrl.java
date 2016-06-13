package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Client;
import com.bam.entity.Utilisateur;

@ManagedBean(name="clientCtrl")
@SessionScoped
public class ClientCtrl implements Serializable {

	@ManagedProperty(value="#{client}")
	Client client;
	
	@ManagedProperty(value="#{facade}")
	Facade facade;
	
	@Resource 
	private LoginController loginController;
	
	@PostConstruct
	public void init(){
		
	}

	//must povide the setter method
	public void LoginController(LoginController loginController) {
		this.loginController = loginController;
	}

	public List<Client> getClients() {
		return facade.getClientBusiness().findAll();
	}
	
	public Client getClientAssociateAsUser(String username){
		if (client == null){
			client = facade.getUtilisateurBusiness().findByUserName(username).getClient();
		}
		return client;
	}
}
