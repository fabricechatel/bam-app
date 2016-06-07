package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bam.entity.Article;

@Component("articletDao")
public class ArticleDaoImpl extends GenericDaoImpl<Article, Integer> implements ArticleDao{
	Logger log = Logger.getLogger(getClass());
}
