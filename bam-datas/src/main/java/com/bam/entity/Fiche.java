package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the fiche database table.
 * 
 */
@Entity
@Table(name="fiche")
@NamedQuery(name="Fiche.findAll", query="SELECT f FROM Fiche f")
public class Fiche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_FICHE", unique=true, nullable=false)
	private int idFiche;

	@Column(nullable=false, length=1024)
	private String description;

	@Column(name="ID_ARTICLE", nullable=false)
	private int idArticle;

	@Column(length=256)
	private String image;

	@Column(name="NOM")
	private String nom;
	
	@Column(name="IS_PUBLISHED")
	private byte isPublished;

	@Column(length=32)
	private String reffiche;

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

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
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

	public String getReffiche() {
		return this.reffiche;
	}

	public void setReffiche(String reffiche) {
		this.reffiche = reffiche;
	}

	public Fiche(int idFiche, String description, int idArticle, String image,
			byte isPublished, String reffiche) {
		super();
		this.idFiche = idFiche;
		this.description = description;
		this.idArticle = idArticle;
		this.image = image;
		this.isPublished = isPublished;
		this.reffiche = reffiche;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Fiche(int idFiche, String description, int idArticle, String image,
			String nom, byte isPublished, String reffiche) {
		super();
		this.idFiche = idFiche;
		this.description = description;
		this.idArticle = idArticle;
		this.image = image;
		this.nom = nom;
		this.isPublished = isPublished;
		this.reffiche = reffiche;
	}

	
}