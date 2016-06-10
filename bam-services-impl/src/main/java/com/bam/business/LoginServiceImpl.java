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
import com.bam.entity.Utilisateur;
import com.bam.entity.UtilisateurRole;

@Service("loginService")
public class LoginServiceImpl implements UserDetailsService {

	@Autowired
	private UtilisateurDao utilisateurDao;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Utilisateur user = utilisateurDao.findByUserName(username);
		if (user == null){
			throw new UsernameNotFoundException(username);
		}

		List<GrantedAuthority> authorities = buildUserAuthority(user
				.getUtilisateurRoles());

		return buildUserForAuthentication(user, authorities);
	}

	private User buildUserForAuthentication(Utilisateur user,
			List<GrantedAuthority> authorities) {
		return new User(user.getLogin(), user.getMdp(),
				user.isEnabled(), true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UtilisateurRole> utilisateurRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (UtilisateurRole userRole : utilisateurRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getNomrole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(
				setAuths);

		return Result;
	}

}
