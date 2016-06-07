package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Adresse;

@Component("adresseDao")
public class AdresseDaoImpl extends GenericDaoImpl<Adresse, Integer> implements AdresseDao {

	Logger log = Logger.getLogger(getClass());
	
}
