package com.bam.test.dao;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.business.CaracteristiqueBusiness;
import com.bam.entity.Caracteristique;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class CaracteristiqueDaoTest {

	@Autowired
	CaracteristiqueBusiness car;
	
	@Test
	public void test(){
		
		Set<Caracteristique> lesCaracteristiques = car.getCaracteristiqueByIdArticle(1);
	
		for (Caracteristique car: lesCaracteristiques)
			System.out.println(car.getIdCaracteristique() + " " + car.getValeur());
	}
}
