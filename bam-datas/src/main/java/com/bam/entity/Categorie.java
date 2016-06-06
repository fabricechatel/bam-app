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

	@Column(nullable=false)
	private int idparent;

	//bi-directional many-to-many association to Article
	@ManyToMany(mappedBy="categories", fetch=FetchType.EAGER)
	private Set<Article> articles;

	//bi-directional many-to-many association to Caracteristique
	@ManyToMany(mappedBy="categories", fetch=FetchType.EAGER)
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

}