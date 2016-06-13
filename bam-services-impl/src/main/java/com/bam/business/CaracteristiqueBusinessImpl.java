package com.bam.business;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bam.dao.ArticleDao;
import com.bam.entity.Caracteristique;

@Service
public class CaracteristiqueBusinessImpl implements CaracteristiqueBusiness {

	@Autowired
	ArticleDao artDao;
	
	@Override
	public void createCaracteristic(Caracteristique caracteristic) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteACaracteristic(Caracteristique caracteristic) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Caracteristique> getCaracteristiqueByIdArticle(int id_Article) {
		// TODO Auto-generated method stub
		return artDao.find(id_Article).getCaracteristiques();
	}

	@Override
	public Set<Caracteristique> findAllCaracteristics() {
		// TODO Auto-generated method stub
		return null;
	}

}
