package com.bam.business;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bam.dao.LiensPanierArticleDao;
import com.bam.dao.PanierDao;
import com.bam.business.PanierBusiness;
import com.bam.entity.Article;
import com.bam.entity.LiensPanierArticle;
import com.bam.entity.Panier;

@Service
public class PanierBusinessImpl implements PanierBusiness {

	@Autowired
//	CRUD<Panier> dao;
	PanierDao dao;
	
	@Autowired
	LiensPanierArticleDao lienDao;

	
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
		Hibernate.initialize(panier.getLiensPanierArticles());
		return panier;
	}
	
	@Transactional
	public Set<Article> getPanierArticles(int entityID){
		Set<LiensPanierArticle> liens = getPanierById(entityID).getLiensPanierArticles();
		
		Set<Article> articles= new HashSet<Article>();
		
		for(LiensPanierArticle l:liens ) {
			//Hibernate.initialize(l.getArticle());
			articles.add(l.getArticle());
		}
		
		return articles;
	}

	@Override
	public List<Panier> findAll() {
		for(Panier panier : dao.findAll()){
			System.out.println(panier.toString());
		}
		return dao.findAll();
	}

	@Transactional
	public Set<LiensPanierArticle> getLiensPanierArticles(int panierID) {	
		return getPanierById(panierID).getLiensPanierArticles();
	}
	
	@Transactional
	public void updateQuantiteLienPanierArticle(int lienID, int quantite){
		lienDao.find(lienID).setQuantitepanier(quantite);
	}
	
}
