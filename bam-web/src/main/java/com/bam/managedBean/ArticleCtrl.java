package com.bam.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.Facade;
import com.bam.entity.Article;

@ManagedBean(name="ArticleCtrl")
public class ArticleCtrl implements Serializable{

	//@ManagedProperty(value = "")
	Facade facade;
	
	public List<Article> listerLesArticles() {
		return facade.getArticleBusiness().LesArticles();
	}
}
