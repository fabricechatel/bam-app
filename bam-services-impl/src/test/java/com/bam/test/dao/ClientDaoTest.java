package com.bam.test.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.dao.AdresseDao;
import com.bam.dao.ClientDao;
import com.bam.dao.UtilisateurDao;
import com.bam.entity.Adresse;
import com.bam.entity.Client;
import com.bam.entity.Utilisateur;
import com.bam.entity.UtilisateurRole;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class ClientDaoTest {

	@Autowired
	ClientDao clientDao;
	
	@Autowired
	UtilisateurDao utilisateurDao;
	
	@Autowired
	AdresseDao adresseDao; 

	@Test
	public void test(){
		
		Adresse a = new Adresse();
		a.setNumero("43");
		a.setVoie("rue danton");
		a.setVille("Malakoff");
		a.setCodePostal("92000");

		UtilisateurRole ur = new UtilisateurRole();
		ur.setEnabled(true);
		ur.setNomrole("ROLE_CLIENT");
		
		Utilisateur u = new Utilisateur();
		u.setLogin("tata");
		u.setMdp("tata");
		u.setEnable(true);
		ur.setUtilisateur(u);
		u.getUtilisateurRoles().add(ur);
		utilisateurDao.save(u);
						
		Client c = new Client();
		
		a.getClients().add(c);
		c.getAdresses().add(a);
		c.setUtilisateur(u);
		
		c.setEmail("totu@toto.to");
		c.setCivilite("M.");
		c.setNom("Toto");
		c.setPrenom("tuitui");
		c.setEnabled(true);
		clientDao.save(c);
		
		Assert.assertNotNull(c);
	}
}
