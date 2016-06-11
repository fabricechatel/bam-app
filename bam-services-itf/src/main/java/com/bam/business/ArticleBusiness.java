package com.bam.business;

import java.util.List;

import com.bam.entity.Article;

public interface ArticleBusiness {
	
	public void CreerAtcile(Article article);
	Article modifierArticle(Article article);
	Article ChercherArticleParNom(String nom);
	
	List<Article> LesArticles();

}
