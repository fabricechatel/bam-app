package com.bam.dao;

import com.bam.entity.Fiche;

public interface FicheDao extends GenericDao<Fiche, Integer> {
		Fiche findByIdArticle(Integer Id_art);
}
