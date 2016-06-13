package com.bam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.UtilisateurDao;
import com.bam.entity.Utilisateur;

@Service
public class UtilisateurBusinessImpl implements UtilisateurBusiness {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Override
	public Utilisateur findByUserName(String username) {
		return utilisateurDao.findByUserName(username);
	}

	@Override
	public boolean userExists(String username) {
		Utilisateur user = utilisateurDao.findByUserName(username);
		if (user != null) {
			return true;
		}
		return false;
	}
}
