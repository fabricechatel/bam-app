package com.bam.test.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.dao.ArticleDao;
import com.bam.entity.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class ArticleDaoTest {

	@Autowired
	ArticleDao articleDao;
	
	@Test
	public void test(){
		List<Article> lesArticles = articleDao.lesArticlesSpectacles();
		//List<Article> lesArticles = articleDao.findAll();
		//List<Article> lesArticles = articleDao.ChercherArticleParNom("guitare");
		for(Article art : lesArticles)
			System.out.println(art.getRefarticle() + " " + art.getIdArticle() + " " + art.getLibelle());
		
		Assert.assertNotNull(lesArticles);
	}

}
