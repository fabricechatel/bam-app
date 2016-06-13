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
	
	public void setDao(ClientDao dao) {
		this.daoClient = dao;
	}
	
	@Override
	public void sauvegarderClient(Client entity) {
		daoClient.save(entity);		
	}

	@Override
	public void effacerClient(Client entity) {
		daoClient.delete(entity);
	}

	@Override
	public Client getClientById(int entityID) {
		return daoClient.find(entityID);
	}

	@Override
	public List<Client> findAll() {
		return daoClient.findAll();
	}
}
