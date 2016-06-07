package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Categorie;

@Component("categorieDao")
public class CategorieDaoImpl extends GenericDaoImpl<Categorie, Integer> implements CategorieDao {

	Logger log = Logger.getLogger(getClass());
	
}
