package com.bam.test.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

import com.bam.dao.FicheDao;
import com.bam.entity.Fiche;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class FicheDaoTest {

	@Autowired
	FicheDao ficheDao;
	
	@Test
	public void Test() {
		
		Fiche maFiche = ficheDao.findByIdArticle(1);
		System.out.println(maFiche.getDescription());
	}
}
