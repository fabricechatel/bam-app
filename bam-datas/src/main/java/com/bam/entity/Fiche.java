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

	@Column(length=256)
	private String image;

	@Column(name="IS_PUBLISHED")
	private Object isPublished;

	@Column(length=32)
	private String reffiche;

	//bi-directional one-to-one association to Article
	@OneToOne
	@JoinColumn(name="ID_ARTICLE", nullable=false)
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

	public Object getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(Object isPublished) {
		this.isPublished = isPublished;
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