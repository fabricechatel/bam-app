package com.bam.test.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.dao.ClientDao;
import com.bam.entity.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class ClientDaoTest {

	@Autowired
	ClientDao clientDao;
	
	@Test
	public void test(){
		
		Client client = clientDao.find(0);
		System.out.println(client.getNom());
		Assert.assertNotNull(client);
	}
}
