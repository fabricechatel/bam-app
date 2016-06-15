package com.bam.business;

import java.util.Set;

import com.bam.entity.Caracteristique;

public interface CaracteristiqueBusiness {

	public void createCaracteristic(Caracteristique caracteristic);
	public void deleteACaracteristic(Caracteristique caracteristic);
	
	Set<Caracteristique> getCaracteristiqueByIdArticle(int id_Article);
	Set<Caracteristique> findAllCaracteristics();
}
