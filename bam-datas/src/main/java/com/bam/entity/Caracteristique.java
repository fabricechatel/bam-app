package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the caracteristique database table.
 * 
 */
@Entity
@NamedQuery(name="Caracteristique.findAll", query="SELECT c FROM Caracteristique c")
public class Caracteristique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CARACTERISTIQUE")
	private int idCaracteristique;

	private String attribut;

	private String valeur;

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="liens_specs_article"
		, joinColumns={
			@JoinColumn(name="ID_CARACTERISTIQUE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ARTICLE")
			}
		)
	private Set<Article> articles;

	//bi-directional many-to-many association to Categorie
	@ManyToMany
	@JoinTable(
		name="liens_specs_categorie"
		, joinColumns={
			@JoinColumn(name="ID_CARACTERISTIQUE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CATEGORIE")
			}
		)
	private Set<Categorie> categories;

	public Caracteristique() {
	}

	public int getIdCaracteristique() {
		return this.idCaracteristique;
	}

	public void setIdCaracteristique(int idCaracteristique) {
		this.idCaracteristique = idCaracteristique;
	}

	public String getAttribut() {
		return this.attribut;
	}

	public void setAttribut(String attribut) {
		this.attribut = attribut;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Categorie> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}

}