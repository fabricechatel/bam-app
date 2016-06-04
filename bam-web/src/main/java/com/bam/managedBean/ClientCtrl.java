package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Client;

@Component("clientCtrl")
@Scope("request")
public class ClientCtrl implements Serializable {

	@Autowired
	Facade facade;

	public List<Client> getClients() {
		return facade.getClientBusiness().findAll();
	}
}
