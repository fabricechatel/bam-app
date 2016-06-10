package com.bam.business;

import java.util.List;

import com.bam.entity.Client;

public interface ClientBusiness {

	public Client sauvegarderClient(Client client);
	public void modifierClient(Client client);
	public void effacerClient(Client client);
	public Client getClientById(int clientId);
	public List<Client> findAll();
}
