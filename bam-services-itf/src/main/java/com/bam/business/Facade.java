package com.bam.business;

import com.bam.entity.Client;

public interface Facade {

	public ClientBusiness getClientBusiness();
	public UtilisateurBusiness getUtilisateurBusiness();
}
