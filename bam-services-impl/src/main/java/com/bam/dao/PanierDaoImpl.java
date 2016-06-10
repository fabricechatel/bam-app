package com.bam.dao;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Article;
import com.bam.entity.Panier;

@Component("panierDao")
public class PanierDaoImpl extends GenericDaoImpl<Panier, Integer> implements PanierDao {

	
	Logger log = Logger.getLogger(getClass());

	
}
