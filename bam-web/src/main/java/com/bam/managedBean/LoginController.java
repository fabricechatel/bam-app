package com.bam.managedBean;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bam.business.Facade;
import com.bam.entity.Utilisateur;

@Controller("login")
@Scope("session")
public class LoginController implements Serializable {
	private static final long serialVersionUID = 1L;
	private String message;
	
	@Autowired
	Facade facade;

	public String getMessage() {
		return message;
	}

//	@RequestMapping(value = { "/", "/home" })
//	public String getUserDefault() {
//		return "home";
//	}
//
//	@RequestMapping("/login")
//	public ModelAndView getLoginForm(@ModelAttribute Utilisateur users,
//			@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout) {
//
//		message = "";
//		if (error != null) {
//			message = "Incorrect username or password !";
//		} else if (logout != null) {
//			message = "Logout successful !";
//		}
//		return new ModelAndView("login", "message", message);
//	}
//
//	@RequestMapping("/admin**")
//	public String getAdminProfile() {
//		return "admin";
//	}
//
//	@RequestMapping("/user**")
//	public String getUserProfile() {
//		return "user";
//	}
//
//	@RequestMapping("/403")
//	public ModelAndView getAccessDenied() {
//		Authentication auth = SecurityContextHolder.getContext()
//				.getAuthentication();
//		String username = "";
//		if (!(auth instanceof AnonymousAuthenticationToken)) {
//			UserDetails userDetail = (UserDetails) auth.getPrincipal();
//			username = userDetail.getUsername();
//		}
//
//		return new ModelAndView("403", "username", username);
//	}
	
	public String logout(){
		HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpServletResponse response = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
        return "login";
    }
}
