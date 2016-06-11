package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.LiensPanierArticle;

@Component("liensPanierArticleDao")
public class LiensPanierArticleDaoImpl extends GenericDaoImpl<LiensPanierArticle, Integer> implements LiensPanierArticleDao {
	Logger log = Logger.getLogger(getClass());
}
