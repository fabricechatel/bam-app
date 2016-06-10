package com.bam.dao;

import java.io.Serializable;
import java.util.List;

import com.bam.entity.Client;

public interface GenericDao<T, ID extends Serializable> {    
	public T save(T entity);
	public void delete(T entity);
	public T find(ID entityID);
	public List<T> findAll();
	public T update(T entity);

}
