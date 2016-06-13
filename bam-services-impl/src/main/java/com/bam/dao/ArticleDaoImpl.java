package com.bam.dao;

import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Article;

@Component("articletDao")
public class ArticleDaoImpl extends GenericDaoImpl<Article, Integer> implements ArticleDao{
	Logger log = Logger.getLogger(getClass());

	@Override
	public List<Article> ChercherArticleParNom(String nom) {
		Query query = em.createQuery("SELECT a FROM Article a WHERE a.libelle LIKE :nom").setParameter("nom", "%"+nom.trim().toLowerCase()+"%");
		
		List<Article> lesArticles = query.getResultList();
		return lesArticles;
	}

}
