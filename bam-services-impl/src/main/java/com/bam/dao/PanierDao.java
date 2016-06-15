package com.bam.dao;

import com.bam.entity.Panier;

public interface PanierDao extends GenericDao<Panier, Integer>{
	
	public Panier getPanierByClientId(int idClient);
	public Panier getPanierByCookie(String str);

}
