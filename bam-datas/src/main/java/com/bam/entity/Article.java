package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@Table(name="article")
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ARTICLE", unique=true, nullable=false)
	private int idArticle;

	@Column(nullable=false, precision=10)
	private BigDecimal prix;

	@Column(nullable=false)
	private int quantite;

	@Column(nullable=false, length=64)
	private String refarticle;

	//bi-directional many-to-many association to Client
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="liste_de_souhaits"
		, joinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CLIENT", nullable=false)
			}
		)
	private Set<Client> clients;

	//bi-directional one-to-one association to LigneCommande
	@OneToOne
	@JoinColumn(name="ID_ARTICLE", referencedColumnName="ID_ARTICLE", nullable=false, insertable=false, updatable=false)
	private LigneCommande ligneCommande;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="article", fetch=FetchType.EAGER)
	private Set<Commentaire> commentaires;

	//bi-directional one-to-one association to Fiche
	@OneToOne(mappedBy="article")
	private Fiche fiche;

	public Article() {
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
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

	public String getRefarticle() {
		return this.refarticle;
	}

	public void setRefarticle(String refarticle) {
		this.refarticle = refarticle;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public LigneCommande getLigneCommande() {
		return this.ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public Set<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Commentaire addCommentaire(Commentaire commentaire) {
		getCommentaires().add(commentaire);
		commentaire.setArticle(this);

		return commentaire;
	}

	public Commentaire removeCommentaire(Commentaire commentaire) {
		getCommentaires().remove(commentaire);
		commentaire.setArticle(null);

		return commentaire;
	}

	public Fiche getFiche() {
		return this.fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

}