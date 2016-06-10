package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the liens_panier_article database table.
 * 
 */
@Entity
@Table(name="liens_panier_article")
@NamedQuery(name="LiensPanierArticle.findAll", query="SELECT l FROM LiensPanierArticle l")
public class LiensPanierArticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LiensPanierArticlePK id;

	private int quantitepanier;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="ID_ARTICLE", insertable=false, updatable=false)
	private Article article;

	//bi-directional many-to-one association to Panier
	@ManyToOne
	@JoinColumn(name="IDPANIER", insertable=false, updatable=false)
	private Panier panier;

	public LiensPanierArticle() {
	}

	public LiensPanierArticlePK getId() {
		return this.id;
	}

	public void setId(LiensPanierArticlePK id) {
		this.id = id;
	}

	public int getQuantitepanier() {
		return this.quantitepanier;
	}

	public void setQuantitepanier(int quantitepanier) {
		this.quantitepanier = quantitepanier;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Panier getPanier() {
		return this.panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

}