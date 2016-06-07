package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.bam.entity.Commentaire;

@Component("commentaireDao")
public class CommentaireDaoImpl extends GenericDaoImpl<Commentaire, Integer>
		implements CommentaireDao {

	Logger log = Logger.getLogger(getClass());
}
