package com.bam.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Categorie;

@Component("categorieDao")
public class CategorieDaoImpl extends GenericDaoImpl<Categorie, Integer> implements CategorieDao {

	Logger log = Logger.getLogger(getClass());
	
}
