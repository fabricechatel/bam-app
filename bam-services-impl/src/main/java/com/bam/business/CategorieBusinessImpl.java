package com.bam.business;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.bam.dao.ArticleDao;
import com.bam.dao.CategorieDao;
import com.bam.entity.Categorie;

@Service
public class CategorieBusinessImpl implements CategorieBusiness{

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public void createCategory(Categorie cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCategorie(Categorie cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Categorie> lesCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Categorie> findACtegorCategoryiesByIdArticle(int id_Article) {
		// TODO Auto-generated method stub
		return articleDao.find(id_Article).getCategories();
	}


}
