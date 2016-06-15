package com.bam.test.dao;

import java.util.List;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.business.CategorieBusiness;
import com.bam.dao.ArticleDao;
import com.bam.dao.CategorieDao;
import com.bam.entity.Categorie;

import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class CategorieDaoTest {
	
	@Autowired
	CategorieBusiness cb;
	
	@Autowired
	ArticleDao articleDao;
	
	@Test
	public void Test(){
		
		Set<Categorie> lesCategories = cb.findACtegorCategoryiesByIdArticle(1);
//		Set<Categorie> lesCategories = articleDao.find(19).getCategories();
		for(Categorie cat : lesCategories)
		System.out.println(cat.getLibelleCategorie() + " " + cat.getIdCategorie());
	}

}
