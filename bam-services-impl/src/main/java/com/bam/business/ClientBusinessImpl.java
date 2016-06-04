package com.bam.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.ClientDao;
import com.bam.business.ClientBusiness;
import com.bam.entity.Client;

@Service
public class ClientBusinessImpl implements ClientBusiness {

	@Autowired
//	CRUD<Client> dao;
	ClientDao dao;	
	
	public void setDao(ClientDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void sauvegarderClient(Client entity) {
		dao.save(entity);		
	}

	@Override
	public void effacerClient(Client entity) {
		dao.delete(entity);
	}

	@Override
	public Client getClientById(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<Client> findAll() {
		for(Client client : dao.findAll()){
			System.out.println(client.toString());
		}
		return dao.findAll();
	}
}
