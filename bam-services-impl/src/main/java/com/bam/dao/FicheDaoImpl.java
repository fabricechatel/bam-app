package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Fiche;

@Component("ficheDao")
public class FicheDaoImpl extends GenericDaoImpl<Fiche, Integer> implements FicheDao {

	Logger log = Logger.getLogger(getClass());
	
}
