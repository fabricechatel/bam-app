package com.bam.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bam.dao.FicheDao;
import com.bam.entity.Fiche;

public class FicheBusinessImpl implements FicheBusiness{

	@Autowired
	FicheDao ficheDao;
	
	@Override
	public void creerFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fiche modifierFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fiche RechercherFicheParIdArticle(int id_Article) {
		
		return ficheDao.findByIdArticle(id_Article);
	}

	@Override
	public List<Fiche> RechercherToutesLesFiches() {
		
		return ficheDao.findAll();
	}

}
