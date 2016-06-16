package com.bam.dao;

import java.util.List;

import com.bam.entity.Article;
import com.bam.entity.Commentaire;

public interface ArticleDao extends GenericDao<Article, Integer> {
	
//	public void CreerAtcile(Article article);
//	Article modifierArticle(Article article);
	List<Article> ChercherArticleParNom(String nom);
	List<Commentaire> lesCommentairesDUnArticle(int id_art);
	List<Article> lesArticlesMusique();
	List<Article> lesArticlesCdDvd();
	List<Article> lesArticlesMusiquesDematerialisees();
	List<Article> lesArticlesInstruments();
	List<Article> lesArticlesMp3();
	List<Article> lesArticlesSpectacles();
//	List<Article> FindAll();

}
