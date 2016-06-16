package com.bam.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bam.business.ArticleBusiness;
import com.bam.business.Facade;
import com.bam.entity.Article;
import com.bam.entity.Caracteristique;
import com.bam.entity.Categorie;
import com.bam.entity.Commentaire;
import com.bam.entity.Fiche;

@ManagedBean(name="ArticleCtrl")
@Scope("request")
public class ArticleCtrl implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value ="#{facadeImpl}")
	Facade facade;
	@ManagedProperty(value ="#{DescCtrl}")
	DescriptionCtrl descCtrl;
//	ArticleBusiness facade;
	//(value ="FacadeImpl")
	
	

	public List<Article> listerLesArticles() {
		return facade.getArticleBusiness().LesArticles();
	}
	
	public List<Article> listerLesNouveautes() {
		List<Article> liste = listerLesArticles();
		List<Article> listenvt = new ArrayList<>();
		
		listenvt.add(liste.get(0));
		listenvt.add(liste.get(1));
		listenvt.add(liste.get(2));
		listenvt.add(liste.get(3));
		listenvt.add(liste.get(4));
		listenvt.add(liste.get(5));
		listenvt.add(liste.get(6));
		listenvt.add(liste.get(18));
		
		return listenvt;
	}
	
	public List<Article> listerLesNouveautes2() {
		List<Article> liste = listerLesArticles();
		List<Article> listenvt = new ArrayList<>();
		
		listenvt.add(liste.get(0));
		listenvt.add(liste.get(1));
		listenvt.add(liste.get(2));
		listenvt.add(liste.get(18));
		
		return listenvt;
	}
	
	public Fiche GetFicheByIdArticle(int id){
		return facade.getFicheBusiness().RechercherFicheParIdArticle(id);
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}
	
	
	public DescriptionCtrl getDescCtrl() {
		return descCtrl;
	}

	public void setDescCtrl(DescriptionCtrl descCtrl) {
		this.descCtrl = descCtrl;
	}

	public String setIdOnClick(int id){
		
		descCtrl.setIdarticleEnClick(id);
		
		System.out.println("*********************************" + id + "**************************************");
		
		return "single-item.xhtml?faces-redirect=true";
		
	}
	
	public String setArticleOnClick(Article article){
		
		descCtrl.setArticle(article);
		return "single-item.xhtml?faces-redirect=true";
	}
	
	public List<Categorie> GetCategoriesParIdArticle(int id_art){
		
		Set<Categorie> cats = facade.categorieBusiness().findACtegorCategoryiesByIdArticle(id_art);
		List<Categorie> lesCats = new ArrayList<>();
		for (Categorie c : cats)
			lesCats.add(c);
		return lesCats;
		
	}
	
	public List<Caracteristique> GetCaracteristiquesParIdArticle(int id_art){
		
		Set<Caracteristique> spec = facade.caracteristiqueBusiness().getCaracteristiqueByIdArticle(id_art);
		List<Caracteristique> lesSpecs = new ArrayList<>();
		for (Caracteristique c : spec)
			lesSpecs.add(c);
		return lesSpecs;
	}
	
	public List<Commentaire> GetLesCommentairesDUnArticle(int id_art){
		
		List<Commentaire> lesCommentaires = facade.getArticleBusiness().lesCommentairesDUnArticle(id_art);
		
		return lesCommentaires;
		
	}
	
	public String recupererLesMusiques(){
		List<Article> musiques = facade.getArticleBusiness().lesArticlesMusique();
//		if (!descCtrl.getLesArticlesSelectionnes().isEmpty())
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(musiques);
		return "items.xhtml?faces-redirect=true";
	}
	
	public String recupererLesCdDvd(){
		List<Article> cd = facade.getArticleBusiness().lesArticlesCdDvd();
//		if (descCtrl.getLesArticlesSelectionnes() != null)
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(cd);
		return "items.xhtml?faces-redirect=true";	}

	public String recupererLesMusiquesDematerialisees(){
		List<Article> musiques = facade.getArticleBusiness().lesArticlesMusiquesDematerialisees();
//		if (descCtrl.getLesArticlesSelectionnes() != null)
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(musiques);
		return "items.xhtml?faces-redirect=true";	}
	
	public String recupererLesInstruments(){
		List<Article> instrus = facade.getArticleBusiness().lesArticlesInstruments();
//		if (descCtrl.getLesArticlesSelectionnes() != null)
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(instrus);
		return "items.xhtml?faces-redirect=true";	}

	public String recupererLesMp3(){
		List<Article> mp3s = facade.getArticleBusiness().lesArticlesMp3();
//		if (descCtrl.getLesArticlesSelectionnes() != null)
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(mp3s);
		return "items.xhtml?faces-redirect=true";	}
	
	public String recupererLesSpectacles(){
		List<Article> specs = facade.getArticleBusiness().lesArticlesSpectacles();
//		if (descCtrl.getLesArticlesSelectionnes() != null)
//		descCtrl.getLesArticlesSelectionnes().clear();
		descCtrl.setLesArticlesSelectionnes(specs);
		return "items.xhtml?faces-redirect=true";	}
	
}
