package com.bam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bam.entity.Client;


@Component("clientDao")
public class ClientDaoImpl extends GenericDaoImpl<Client, Integer> implements ClientDao {
	
	Logger log = Logger.getLogger(getClass());
}
