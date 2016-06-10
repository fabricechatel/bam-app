package com.bam.test.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.dao.PanierDao;
import com.bam.entity.Article;
import com.bam.entity.Panier;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class PanierDaoTest {

	@Autowired
	PanierDao panierDao;
	
	@Test
	public void test(){		
		Panier panier = panierDao.find(0);
		for(Article a: panier.getArticles())System.out.println(a.getRefarticle());
		
		Assert.assertNotNull(panier);
	}
}
