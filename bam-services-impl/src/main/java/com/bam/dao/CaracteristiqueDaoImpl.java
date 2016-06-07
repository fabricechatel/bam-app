package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Caracteristique;

@Component("caracteristiqueDao")
public class CaracteristiqueDaoImpl extends GenericDaoImpl<Caracteristique, Integer> implements CaracteristiqueDao {

	Logger log = Logger.getLogger(getClass());
	
}
