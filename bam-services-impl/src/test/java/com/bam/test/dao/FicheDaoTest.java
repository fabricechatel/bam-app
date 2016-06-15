package com.bam.test.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

import com.bam.business.Facade;
import com.bam.business.FicheBusiness;
import com.bam.dao.FicheDao;
import com.bam.entity.Fiche;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class FicheDaoTest {

	@Autowired
	Facade facade;
	
	@Test
	public void Test() {
		
		//Fiche maFiche = ficheDao.findByIdArticle(1);
		//Fiche maFiche = ficheDao.RechercherFicheParIdArticle(1);
		Fiche maFiche = facade.getFicheBusiness().RechercherFicheParIdArticle(1);
		System.out.println(maFiche.getImage());
	}
}
