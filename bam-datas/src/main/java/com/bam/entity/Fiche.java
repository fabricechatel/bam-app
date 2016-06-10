package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fiche database table.
 * 
 */
@Entity
@NamedQuery(name="Fiche.findAll", query="SELECT f FROM Fiche f")
public class Fiche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_FICHE")
	private int idFiche;

	private String description;

	private String image;

	@Column(name="IS_PUBLISHED")
	private byte isPublished;

	private String nom;

	private String reffiche;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="ID_ARTICLE")
	private Article article;

	public Fiche() {
	}

	public int getIdFiche() {
		return this.idFiche;
	}

	public void setIdFiche(int idFiche) {
		this.idFiche = idFiche;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReffiche() {
		return this.reffiche;
	}

	public void setReffiche(String reffiche) {
		this.reffiche = reffiche;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}