package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Commande;

@Component("commandeDao")
public class CommandeDaoImpl extends GenericDaoImpl<Commande, Integer>
		implements CommandeDao {

	Logger log = Logger.getLogger(getClass());
}
