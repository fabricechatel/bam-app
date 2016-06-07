package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.bam.entity.LigneCommande;

@Component("ligneCommandeDao")
public class LigneCommandeDaoImpl extends
		GenericDaoImpl<LigneCommande, Integer> implements LigneCommandeDao {

	Logger log = Logger.getLogger(getClass());

}
