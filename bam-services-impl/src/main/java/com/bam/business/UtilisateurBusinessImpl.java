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
public class UtilisateurBusinessImpl implements UserDetailsService {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Utilisateur user = utilisateurDao.findByUserName(username);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRole());
	
		return buildUserForAuthentication(user, authorities);
	}
	
	// Converts com.mkyong.users.model.User user to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(Utilisateur user, 
		List<GrantedAuthority> authorities) {
		return new User(user.getLogin(), 
			user.getMdp(), true, 
	                    true, true, true, authorities);
	}
	
	private List<GrantedAuthority> buildUserAuthority(Role userRole) {
	
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
	
		// Build user's authorities
		setAuths.add(new SimpleGrantedAuthority(userRole.getNom()));
	
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
	
		return Result;
	}
}
