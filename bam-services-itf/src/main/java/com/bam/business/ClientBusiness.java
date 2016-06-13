package com.bam.business;

import java.util.List;

import com.bam.entity.Adresse;
import com.bam.entity.Client;

public interface ClientBusiness {

	public Client sauvegarderClient(Client client);
	public Client modifierClient(Client client);
	public void effacerClient(Client client);
	public Client getClientById(int clientID);
	public List<Client> findAllClient();
	
	public Adresse sauvegarderAdresse(Adresse adresse);
	public Adresse modifierAdresse(Adresse adresse);
	public void effacerAdresse(Adresse adresse);
	public Adresse getAdresseById(int adresseID);
	public List<Adresse> findAllAdresse();
	
}
