package com.bam.dao;

import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Article;
import com.bam.entity.Commentaire;

@Component("articletDao")
public class ArticleDaoImpl extends GenericDaoImpl<Article, Integer> implements ArticleDao{
	Logger log = Logger.getLogger(getClass());

	@Override
	public List<Article> ChercherArticleParNom(String nom) {
		Query query = em.createQuery("SELECT a FROM Article a WHERE a.libelle LIKE :nom").setParameter("nom", "%"+nom.trim().toLowerCase()+"%");
		
		List<Article> lesArticles = query.getResultList();
		return lesArticles;
	}

	@Override
	public List<Commentaire> lesCommentairesDUnArticle(int id_art) {
		Query query = em.createQuery("SELECT c FROM Commentaire c WHERE c.article.idArticle = ?").setParameter(1, id_art);
		
		List<Commentaire> lesCommentaires = query.getResultList();
		return lesCommentaires;
	}

	@Override
	public List<Article> lesArticlesMusique() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idCategorie = 5 OR c.idCategorie = 1");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

	@Override
	public List<Article> lesArticlesCdDvd() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idCategorie = 5 OR c.idCategorie = 4");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

	@Override
	public List<Article> lesArticlesMusiquesDematerialisees() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idCategorie = 1 OR c.idCategorie = 15");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

	@Override
	public List<Article> lesArticlesInstruments() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idparent = 2");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

	@Override
	public List<Article> lesArticlesMp3() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idCategorie = 1");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

	@Override
	public List<Article> lesArticlesSpectacles() {
		Query query = em.createQuery("SELECT a FROM Article a JOIN a.categories c WHERE c.idCategorie = 9");
		List<Article> lesArt = query.getResultList();
		return lesArt;
	}

}
