package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CLIENT")
	private int idClient;

	private byte actif;

	private String civilite;

	private String email;

	private String nom;

	private String prenom;

	//bi-directional many-to-many association to Article
	@ManyToMany(mappedBy="clients")
	private Set<Article> articles;

	//bi-directional many-to-many association to Adresse
	@ManyToMany
	@JoinTable(
		name="liens_client_adresse"
		, joinColumns={
			@JoinColumn(name="ID_CLIENT")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ADRESSE")
			}
		)
	private Set<Adresse> adresses;

	//bi-directional one-to-one association to Utilisateur
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ID_UTILISATEUR")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="client")
	private Set<Commande> commandes;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="client")
	private Set<Commentaire> commentaires;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="client")
	private Set<Panier> paniers;

	public Client() {
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public byte getActif() {
		return this.actif;
	}

	public void setActif(byte actif) {
		this.actif = actif;
	}

	public String getCivilite() {
		return this.civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Adresse> getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Set<Adresse> adresses) {
		this.adresses = adresses;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setClient(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setClient(null);

		return commande;
	}

	public Set<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Commentaire addCommentaire(Commentaire commentaire) {
		getCommentaires().add(commentaire);
		commentaire.setClient(this);

		return commentaire;
	}

	public Commentaire removeCommentaire(Commentaire commentaire) {
		getCommentaires().remove(commentaire);
		commentaire.setClient(null);

		return commentaire;
	}

	public Set<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(Set<Panier> paniers) {
		this.paniers = paniers;
	}

	public Panier addPanier(Panier panier) {
		getPaniers().add(panier);
		panier.setClient(this);

		return panier;
	}

	public Panier removePanier(Panier panier) {
		getPaniers().remove(panier);
		panier.setClient(null);

		return panier;
	}

}