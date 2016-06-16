package com.bam.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
	
	@Column(name="QUANTITEPANIER",updatable=true)
	private int quantitepanier;

	@Override
	public String toString() {
		return "LiensPanierArticle [id=" + id + ", quantitepanier="	+ quantitepanier + ", article=" + article + "]";
	}

	//bi-directional many-to-one association to Article
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_ARTICLE", insertable=false, updatable=false)
	private Article article;

	//bi-directional many-to-one association to Panier
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDPANIER", insertable=false, updatable=false)
	private Panier panier;

	public LiensPanierArticle() {
	}
	

	public LiensPanierArticle(int quantitepanier, Article article, Panier panier) {
		super();
		this.quantitepanier = quantitepanier;
		this.article = article;
		this.panier = panier;
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
	
	public BigDecimal getPrixCummule(){
		return this.getArticle().getPrix().multiply(new BigDecimal(this.getQuantitepanier()))   ;
		
	}
	

}