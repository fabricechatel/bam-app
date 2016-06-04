package com.bam.business;

import java.util.List;

import com.bam.entity.Client;

public interface ClientBusiness {

	public void sauvegarderClient(Client entity);
	public void effacerClient(Client entity);
	public Client getClientById(int entityID);
	
	public List<Client> findAll();
}
