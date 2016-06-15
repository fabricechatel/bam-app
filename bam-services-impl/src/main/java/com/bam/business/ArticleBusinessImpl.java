package com.bam.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.ArticleDao;
import com.bam.entity.Article;
import com.bam.entity.Commentaire;

@Service
public class ArticleBusinessImpl implements ArticleBusiness{

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public void CreerAtcile(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article modifierArticle(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article ChercherArticleParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> LesArticles() {
		// TODO Auto-generated method stub
		return articleDao.findAll();
	}

	@Override
	public List<Commentaire> lesCommentairesDUnArticle(int id_art) {
		// TODO Auto-generated method stub
		return articleDao.lesCommentairesDUnArticle(id_art);
	}

}
