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

	@Column(name="LIBELLE")
	private String libelle;
	
	@Column(nullable=false, precision=10)
	private BigDecimal prix;

	@Column(name="QUANTITESTOCK", nullable=false)
	private int quantite;

	@Column(nullable=false, length=64)
	private String refarticle;

	//bi-directional many-to-many association to Panier
	@ManyToMany
	@JoinTable(
		name="liens_panier_article"
		, joinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="IDPANIER", nullable=false)
			}
		)
	private Set<Panier> paniers;

	//bi-directional many-to-many association to Caracteristique
	@ManyToMany(mappedBy="articles", fetch = FetchType.EAGER)
	private Set<Caracteristique> caracteristiques;

	//bi-directional many-to-many association to Categorie
	@ManyToMany(mappedBy="articles", fetch = FetchType.EAGER)
	private Set<Categorie> categories;

	//bi-directional many-to-many association to Client
	@ManyToMany(mappedBy="articles")
	private Set<Client> clients;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="article")
	private Set<Commentaire> commentaires;

	//bi-directional one-to-one association to LigneCommande
	@OneToOne(mappedBy="article")
	private LigneCommande ligneCommande;

	//bi-directional many-to-many association to Promotion
//	@ManyToMany(mappedBy="articles")
//	private Set<Promotion> promotions;

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

	public Set<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(Set<Panier> paniers) {
		this.paniers = paniers;
	}

	public Set<Caracteristique> getCaracteristiques() {
		return this.caracteristiques;
	}

	public void setCaracteristiques(Set<Caracteristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public Set<Categorie> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
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

	public LigneCommande getLigneCommande() {
		return this.ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

//	public Set<Promotion> getPromotions() {
//		return this.promotions;
//	}
//
//	public void setPromotions(Set<Promotion> promotions) {
//		this.promotions = promotions;
//	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Article(int idArticle, String libelle, BigDecimal prix,
			int quantite, String refarticle, Set<Panier> paniers,
			Set<Caracteristique> caracteristiques, Set<Categorie> categories,
			Set<Client> clients, Set<Commentaire> commentaires,
			LigneCommande ligneCommande /*, Set<Promotion> promotions */ ) {
		super();
		this.idArticle = idArticle;
		this.libelle = libelle;
		this.prix = prix;
		this.quantite = quantite;
		this.refarticle = refarticle;
		this.paniers = paniers;
		this.caracteristiques = caracteristiques;
		this.categories = categories;
		this.clients = clients;
		this.commentaires = commentaires;
		this.ligneCommande = ligneCommande;
//		this.promotions = promotions;
	}

	public Article(int idArticle, String libelle, BigDecimal prix,
			int quantite, String refarticle) {
		super();
		this.idArticle = idArticle;
		this.libelle = libelle;
		this.prix = prix;
		this.quantite = quantite;
		this.refarticle = refarticle;
	}

	
}