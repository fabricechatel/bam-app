package com.bam.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.bam.entity.Promotion;

@Component("promotionDao")
public class PromotionDaoImpl extends GenericDaoImpl<Promotion, Integer>
		implements PromotionDao {
	Logger log = Logger.getLogger(getClass());
}
