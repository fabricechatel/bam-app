package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the promotion database table.
 * 
 */
@Entity
@Table(name="promotion")
@NamedQuery(name="Promotion.findAll", query="SELECT p FROM Promotion p")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PROMOTION", unique=true, nullable=false)
	private int idPromotion;

	@Column(nullable=false)
	private int pourcentage;

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="liens_promotions_articles"
		, joinColumns={
			@JoinColumn(name="ID_PROMOTION", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		)
	private Set<Article> articles;

	public Promotion() {
	}

	public int getIdPromotion() {
		return this.idPromotion;
	}

	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

	public int getPourcentage() {
		return this.pourcentage;
	}

	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}