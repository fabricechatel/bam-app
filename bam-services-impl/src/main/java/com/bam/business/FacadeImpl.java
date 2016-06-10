package com.bam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.business.ClientBusiness;
import com.bam.business.Facade;
import com.bam.entity.Client;

@Service
public class FacadeImpl implements Facade {

	@Autowired
	ClientBusiness clientBusiness;

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return clientBusiness.sauvegarderClient(client);
	}

	/*
	@Override
	public ClientBusiness getClientBusiness() {
		return clientBusiness;
	}
	*/

}
