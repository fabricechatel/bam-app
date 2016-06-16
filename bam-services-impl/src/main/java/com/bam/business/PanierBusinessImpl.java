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
	PanierDao dao;
	
	@Autowired
	LiensPanierArticleDao lienDao;

	
	public void setDao(PanierDao dao) {
		this.dao = dao;
	}
	
	public void setLienDao(LiensPanierArticleDao lienDao) {
		this.lienDao = lienDao;
	}

	
	@Transactional
	public void sauvegarderPanier(Panier entity) {
		for(LiensPanierArticle l: entity.getLiensPanierArticles())
			lienDao.update(l);
	}

	@Transactional
	public void effacerPanier(Panier entity) {
		for(LiensPanierArticle l: entity.getLiensPanierArticles())
			lienDao.delete(l);
	}

	@Transactional
	public Panier getPanierById(int idPanier) {
		Panier panier = dao.find(idPanier);
		Hibernate.initialize(panier.getLiensPanierArticles());
		return panier;
	}
	
		
	@Transactional
	public Set<Article> getPanierArticles(int entityID){
		List<LiensPanierArticle> liens = getPanierById(entityID).getLiensPanierArticles();
		Set<Article> articles= new HashSet<Article>();
		
		for(LiensPanierArticle l:liens ) {
			
			articles.add(l.getArticle());
		}
		
		return articles;
	}


	@Transactional
	public List<LiensPanierArticle> getLiensPanierArticles(Panier panier) {	
		//Hibernate.initialize(l.getArticle());
		return getPanierById(panier.getIdpanier()).getLiensPanierArticles();
	}
	
	@Transactional
	public void updateLienPanierArticle(LiensPanierArticle lien){
		lienDao.update(lien);
	}
	
	@Transactional
	public void saveLienPanierArticle(LiensPanierArticle lien){
		lienDao.save(lien);
	}


	@Transactional
	public void deleteLienPanierArticle(LiensPanierArticle lien) {
		lienDao.delete(lien);
	}

	@Transactional
	public List<LiensPanierArticle> getLiensPanierArticlesValides(Panier panier) {
		List<LiensPanierArticle> liens = getPanierById(panier.getIdpanier()).getLiensPanierArticles();
		for (LiensPanierArticle l :liens) if (l.getQuantitepanier()==0)liens.remove(l);
		return liens;
	}

	@Transactional
	public Panier getPanierByClientId(int idClient) {		
		return dao.getPanierByClientId(idClient);
	}

	@Transactional
	public Panier getPanierByCookie(String cookie) {		
		return dao.getPanierByCookie(cookie);
	}

	@Transactional
	public void creerPanier(String ref) {
			Panier panier = new Panier();
			panier.setClient(null);
			panier.setRefinternaute(ref);
			dao.save(panier);
	}




	
}
