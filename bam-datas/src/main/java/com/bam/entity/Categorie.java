package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CATEGORIE")
	private int idCategorie;

	private byte active;

	public Categorie(int idCategorie, int idparent,
			String libelleCategorie, byte active) {
		super();
		this.idCategorie = idCategorie;
		this.active = active;
		this.idparent = idparent;
		this.libelleCategorie = libelleCategorie;
	}
	
	public Categorie(int idCategorie, String libelleCategorie, byte active) {
		this.idCategorie = idCategorie;
		this.active = active;
		this.libelleCategorie = libelleCategorie;
	}
	private int idparent;

	@Column(name="LIBELLE_CATEGORIE")
	private String libelleCategorie;

	//bi-directional many-to-many association to Article
	@ManyToMany(mappedBy="categories")
	private Set<Article> articles;

	//bi-directional many-to-many association to Caracteristique
	@ManyToMany(mappedBy="categories")
	private Set<Caracteristique> caracteristiques;

	public Categorie() {
	}



	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getIdparent() {
		return this.idparent;
	}

	public void setIdparent(int idparent) {
		this.idparent = idparent;
	}

	public String getLibelleCategorie() {
		return this.libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
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

}