package com.bam.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bam.dao.UtilisateurDao;
import com.bam.entity.Role;
import com.bam.entity.Utilisateur;

@Service
public class UtilisateurBusinessImpl implements UtilisateurBusiness {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Override
	public Utilisateur findByUserName(String username) {
		return utilisateurDao.findByUserName(username);
	}
}
