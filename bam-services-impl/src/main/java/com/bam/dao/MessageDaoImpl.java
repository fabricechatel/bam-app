package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Message;

@Component("messageDao")
public class MessageDaoImpl extends GenericDaoImpl<Message, Integer> implements MessageDao {
	
	Logger log = Logger.getLogger(getClass());

}
