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
	
	@Autowired
	FicheBusiness ficheBusiness;
	
	@Autowired
	CategorieBusiness categorieBusiness;
	
	@Autowired
	CaracteristiqueBusiness caracteristiqueBusiness;
	
	@Override
	public ClientBusiness getClientBusiness() {
		return clientBusiness;
	}

	@Override
	public ArticleBusiness getArticleBusiness() {
		return articleBusiness;
	}

	@Override
	public FicheBusiness getFicheBusiness() {
		return ficheBusiness;
	}

	@Override
	public CategorieBusiness categorieBusiness() {
		// TODO Auto-generated method stub
		return categorieBusiness;
	}

	@Override
	public CaracteristiqueBusiness caracteristiqueBusiness() {
		// TODO Auto-generated method stub
		return caracteristiqueBusiness;
	}

	
}
