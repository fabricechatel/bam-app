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
	ArticleBusiness articleBusiness;
	
	@Override
	public ClientBusiness getClientBusiness() {
		return clientBusiness;
	}

	@Override
	public ArticleBusiness getArticleBusiness() {
		return articleBusiness;
	}

}
