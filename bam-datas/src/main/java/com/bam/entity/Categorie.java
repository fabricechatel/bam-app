package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@Table(name="categorie")
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CATEGORIE", unique=true, nullable=false)
	private int idCategorie;

	@Column(name="LIBELLE_CATEGORIE")
	private String libelleCategorie;
	
	@Column(name="IDPARENT")
	private int idparent;

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="liens_categorie_article"
		, joinColumns={
			@JoinColumn(name="ID_CATEGORIE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		)
	private Set<Article> articles;

	//bi-directional many-to-many association to Caracteristique
	@ManyToMany
	@JoinTable(
		name="liens_specs_categorie"
		, joinColumns={
			@JoinColumn(name="ID_CATEGORIE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CARACTERISTIQUE", nullable=false)
			}
		)
	private Set<Caracteristique> caracteristiques;

	public Categorie() {
	}

	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public int getIdparent() {
		return this.idparent;
	}

	public void setIdparent(int idparent) {
		this.idparent = idparent;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Caracteristique> getCaracteristiques() {
		return this.caracteristiques;
	}

	public void setCaracteristiques(Set<Caracteristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	public Categorie(int idCategorie, String libelleCategorie, int idparent,
			Set<Article> articles, Set<Caracteristique> caracteristiques) {
		super();
		this.idCategorie = idCategorie;
		this.libelleCategorie = libelleCategorie;
		this.idparent = idparent;
		this.articles = articles;
		this.caracteristiques = caracteristiques;
	}

	public Categorie(String libelleCategorie, int idparent) {
		super();
		this.libelleCategorie = libelleCategorie;
		this.idparent = idparent;
	}

	
}