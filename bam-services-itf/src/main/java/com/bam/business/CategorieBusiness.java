package com.bam.business;

import java.util.List;
import java.util.Set;

import com.bam.entity.Categorie;


public interface CategorieBusiness {
	
	public void createCategory(Categorie cat);
	public void supprimerCategorie(Categorie cat);
	
	Set<Categorie> findACtegorCategoryiesByIdArticle(int id_Article);
	
	Set<Categorie> lesCategories();

}
