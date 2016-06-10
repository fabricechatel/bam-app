package com.bam.business;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bam.dao.PanierDao;
import com.bam.business.PanierBusiness;
import com.bam.entity.Panier;

@Service
public class PanierBusinessImpl implements PanierBusiness {

	@Autowired
//	CRUD<Panier> dao;
	PanierDao dao;	
	
	public void setDao(PanierDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void sauvegarderPanier(Panier entity) {
		dao.save(entity);		
	}

	@Override
	public void effacerPanier(Panier entity) {
		dao.delete(entity);
	}

	@Transactional
	public Panier getPanierById(int entityID) {
		Panier panier = dao.find(entityID);
		Hibernate.initialize(panier.getArticles());
		return panier;
	}

	@Override
	public List<Panier> findAll() {
		for(Panier panier : dao.findAll()){
			System.out.println(panier.toString());
		}
		return dao.findAll();
	}
	
}
