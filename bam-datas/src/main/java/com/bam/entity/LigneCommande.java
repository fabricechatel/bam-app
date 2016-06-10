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

	private BigDecimal prix;

	private int quantitecommande;

	private String statut;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="ID_ARTICLE")
	private Article article;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="ID_COMMANDE")
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

	public int getQuantitecommande() {
		return this.quantitecommande;
	}

	public void setQuantitecommande(int quantitecommande) {
		this.quantitecommande = quantitecommande;
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