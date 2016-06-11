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
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", libelle=" + libelle
				+ ", prix=" + prix + ", refarticle=" + refarticle
				+ ", visible=" + visible + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ARTICLE")
	private int idArticle;

	private String libelle;

	private BigDecimal prix;

	private int quantitestock;

	private String refarticle;

	private byte visible;

	//bi-directional many-to-many association to Categorie
	@ManyToMany
	@JoinTable(
		name="liens_categorie_article"
		, joinColumns={
			@JoinColumn(name="ID_ARTICLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CATEGORIE")
			}
		)
	private Set<Categorie> categories;

	//bi-directional many-to-many association to Client
	@ManyToMany
	@JoinTable(
		name="liste_de_souhaits"
		, joinColumns={
			@JoinColumn(name="ID_ARTICLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CLIENT")
			}
		)
	private Set<Client> clients;

	//bi-directional many-to-many association to Promotion
	@ManyToMany
	@JoinTable(
		name="liens_promotions_articles"
		, joinColumns={
			@JoinColumn(name="ID_ARTICLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_PROMOTION")
			}
		)
	private Set<Promotion> promotions;

	//bi-directional many-to-many association to Caracteristique
	@ManyToMany(mappedBy="articles")
	private Set<Caracteristique> caracteristiques;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="article")
	private Set<Commentaire> commentaires;

	//bi-directional many-to-one association to Fiche
	@OneToMany(mappedBy="article")
	private Set<Fiche> fiches;

	//bi-directional many-to-one association to LiensPanierArticle
	@OneToMany(mappedBy="article")
	private Set<LiensPanierArticle> liensPanierArticles;

	//bi-directional many-to-one association to LigneCommande
	@OneToMany(mappedBy="article")
	private Set<LigneCommande> ligneCommandes;

	public Article() {
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public int getQuantitestock() {
		return this.quantitestock;
	}

	public void setQuantitestock(int quantitestock) {
		this.quantitestock = quantitestock;
	}

	public String getRefarticle() {
		return this.refarticle;
	}

	public void setRefarticle(String refarticle) {
		this.refarticle = refarticle;
	}

	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
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

	public Set<Promotion> getPromotions() {
		return this.promotions;
	}

	public void setPromotions(Set<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Set<Caracteristique> getCaracteristiques() {
		return this.caracteristiques;
	}

	public void setCaracteristiques(Set<Caracteristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
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

	public Set<Fiche> getFiches() {
		return this.fiches;
	}

	public void setFiches(Set<Fiche> fiches) {
		this.fiches = fiches;
	}

	public Fiche addFich(Fiche fich) {
		getFiches().add(fich);
		fich.setArticle(this);

		return fich;
	}

	public Fiche removeFich(Fiche fich) {
		getFiches().remove(fich);
		fich.setArticle(null);

		return fich;
	}

	public Set<LiensPanierArticle> getLiensPanierArticles() {
		return this.liensPanierArticles;
	}

	public void setLiensPanierArticles(Set<LiensPanierArticle> liensPanierArticles) {
		this.liensPanierArticles = liensPanierArticles;
	}

	public LiensPanierArticle addLiensPanierArticle(LiensPanierArticle liensPanierArticle) {
		getLiensPanierArticles().add(liensPanierArticle);
		liensPanierArticle.setArticle(this);

		return liensPanierArticle;
	}

	public LiensPanierArticle removeLiensPanierArticle(LiensPanierArticle liensPanierArticle) {
		getLiensPanierArticles().remove(liensPanierArticle);
		liensPanierArticle.setArticle(null);

		return liensPanierArticle;
	}

	public Set<LigneCommande> getLigneCommandes() {
		return this.ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public LigneCommande addLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().add(ligneCommande);
		ligneCommande.setArticle(this);

		return ligneCommande;
	}

	public LigneCommande removeLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().remove(ligneCommande);
		ligneCommande.setArticle(null);

		return ligneCommande;
	}

}