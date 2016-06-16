package com.bam.managedBean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;

import com.bam.entity.Article;

@ManagedBean(name="DescCtrl")
@Scope("request")
public class DescriptionCtrl {

	private static int IdarticleEnClick;
	private static Article article;
	private static List<Article> lesArticlesSelectionnes;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getIdarticleEnClick() {
		return IdarticleEnClick;
	}

	public void setIdarticleEnClick(int idarticleEnClick) {
		IdarticleEnClick = idarticleEnClick;
	}

	public List<Article> getLesArticlesSelectionnes() {
		return lesArticlesSelectionnes;
	}

	public void setLesArticlesSelectionnes(List<Article> lesArticlesSelectionnes) {
		this.lesArticlesSelectionnes = lesArticlesSelectionnes;
	}

	
	
	
}
