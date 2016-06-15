package com.bam.business;

import java.util.List;

import com.bam.entity.Article;
import com.bam.entity.Commentaire;

public interface ArticleBusiness {
	
	public void CreerAtcile(Article article);
	Article modifierArticle(Article article);
	Article ChercherArticleParNom(String nom);
	List<Commentaire> lesCommentairesDUnArticle(int id_art);
	List<Article> LesArticles();

}
