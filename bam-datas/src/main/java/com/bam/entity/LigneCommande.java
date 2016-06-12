package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ligne_commande database table.
 * 
 */
@Entity
@Table(name="ligne_commande")
@NamedQuery(name="LigneCommande.findAll", query="SELECT l FROM LigneCommande l")
public class LigneCommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LigneCommandePK id;

	@Column(precision=10)
	private BigDecimal prix;

	@Column(name="QUANTITECOMMANDE")
	private int quantite;

	@Column(length=16)
	private String statut;

	//bi-directional one-to-one association to Article
	@OneToOne
	@JoinColumn(name="ID_ARTICLE", nullable=false, insertable=false, updatable=false)
	private Article article;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="ID_COMMANDE", nullable=false, insertable=false, updatable=false)
	private Commande commande;

	public LigneCommande() {
	}

	public LigneCommandePK getId() {
		return this.id;
	}

	public void setId(LigneCommandePK id) {
		this.id = id;
	}

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}