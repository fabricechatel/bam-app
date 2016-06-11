package com.bam.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.AdresseDao;
import com.bam.dao.ClientDao;
import com.bam.dao.RoleDao;
import com.bam.dao.UtilisateurDao;
import com.bam.business.ClientBusiness;
import com.bam.entity.Client;

@Service
public class ClientBusinessImpl implements ClientBusiness {

	@Autowired
	ClientDao daoClient;
	
	@Autowired
	AdresseDao daoAdresse;
	
	@Autowired
	UtilisateurDao daoUtilisateur;
	
	@Autowired
	RoleDao daoRole;

	public ClientDao getDaoClient() {
		return daoClient;
	}

	public void setDaoClient(ClientDao daoClient) {
		this.daoClient = daoClient;
	}

	public AdresseDao getDaoAdresse() {
		return daoAdresse;
	}

	public void setDaoAdresse(AdresseDao daoAdresse) {
		this.daoAdresse = daoAdresse;
	}

	public UtilisateurDao getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public void setDaoUtilisateur(UtilisateurDao daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}

	public RoleDao getDaoRole() {
		return daoRole;
	}

	public void setDaoRole(RoleDao daoRole) {
		this.daoRole = daoRole;
	}

	@Override
	public Client sauvegarderClient(Client client) {
		// TODO Auto-generated method stub
		return daoClient.save(client);
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		daoClient.update(client);
	}

	@Override
	public void effacerClient(Client client) {
		// TODO Auto-generated method stub
		daoClient.delete(client);
	}

	@Override
	public Client getClientById(int clientId) {
		// TODO Auto-generated method stub
		return daoClient.find(clientId);
	}

	@Override
	public List<Client> findAll() {
		return daoClient.findAll();
	}	
	
}
