package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the caracteristique database table.
 * 
 */
@Entity
@Table(name="caracteristique")
@NamedQuery(name="Caracteristique.findAll", query="SELECT c FROM Caracteristique c")
public class Caracteristique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CARACTERISTIQUE", unique=true, nullable=false)
	private int idCaracteristique;

	@Column(nullable=false, length=128)
	private String valeur;

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="liens_specs_article"
		, joinColumns={
			@JoinColumn(name="ID_CARACTERISTIQUE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		)
	private Set<Article> articles;

	//bi-directional many-to-many association to Categorie
	@ManyToMany(mappedBy="caracteristiques")
	private Set<Categorie> categories;

	public Caracteristique() {
	}

	public int getIdCaracteristique() {
		return this.idCaracteristique;
	}

	public void setIdCaracteristique(int idCaracteristique) {
		this.idCaracteristique = idCaracteristique;
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