package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;

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
import org.springframework.stereotype.Component;

//import javax.inject.Inject;
//import javax.inject.Named;

import com.bam.business.Facade;
import com.bam.entity.Client;
import com.bam.entity.Utilisateur;


//@Named


//@ManagedBean(name="clientCtrl")
//@RequestScoped

@Component("clientCtrl")
@Scope("request")
public class ClientCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	private Client client;

//	@ManagedProperty(value="#{facade}")
	@Autowired
	private Facade facade;
	
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
		if ((request.getRemoteUser() != null) && (client == null) ){
			client = new Client();
			if (facade != null) {
				Utilisateur u = facade.getUtilisateurBusiness().findByUserName(request.getRemoteUser());
				if ((u != null) && (u.getClient() != null)){
					client = u.getClient();
				}
			}
		}
	}
}
;