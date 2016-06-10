package com.bam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.business.ClientBusiness;
import com.bam.business.Facade;

@Service
public class FacadeImpl implements Facade {

	@Autowired
	ClientBusiness clientBusiness;
	
	@Autowired
	PanierBusiness panierBusiness;
	
	@Override
	public ClientBusiness getClientBusiness() {
		return clientBusiness;
	}

	@Override
	public PanierBusiness getPanierBusiness() {
		return panierBusiness;
	}

}
