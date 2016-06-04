package com.bam.dao;

import java.util.List;

import com.bam.entity.Client;

public interface ClientDao {

	public void save(Client entity);
	public void delete(Client entity);
	public Client find(int entityID);
	public List<Client> findAll();
	public Client update(Client entity);
}
