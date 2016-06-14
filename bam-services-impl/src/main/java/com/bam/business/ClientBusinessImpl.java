package com.bam.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.AdresseDao;
import com.bam.dao.ClientDao;
import com.bam.business.ClientBusiness;
import com.bam.entity.Adresse;
import com.bam.entity.Client;

@Service
public class ClientBusinessImpl implements ClientBusiness {

	@Autowired
	ClientDao daoClient;	
	
	@Autowired
	AdresseDao daoAdresse;
	
	public void setDao(ClientDao daoClient) {
		this.daoClient = daoClient;
	}
	
	@Override
	public void sauvegarderClient(Client client) {
		daoClient.save(client);		
	}
	
	@Override
	public Client modifierClient(Client client) {
		return daoClient.update(client);
	}

	@Override
	public void effacerClient(Client client) {
		daoClient.delete(client);
	}

	@Override
	public Client getClientById(int clientID) {
		return daoClient.find(clientID);
	}

	@Override
	public void sauvegarderAdresse(Adresse adresse) {
		daoAdresse.save(adresse);
	}

	@Override
	public Adresse modifierAdresse(Adresse adresse) {
		return daoAdresse.update(adresse);
	}

	@Override
	public void effacerAdresse(Adresse adresse) {
		daoAdresse.delete(adresse);
	}

	@Override
	public Adresse getAdresseById(int adresseID) {
		return daoAdresse.find(adresseID);
	}
}

