package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLIENT", unique=true, nullable=false)
	private int idClient;

	@Column(nullable=false, length=8)
	private String civilite;

	@Column(nullable=false, length=128)
	private String email;

	@Column(nullable=false, length=64)
	private String nom;

	@Column(nullable=false, length=64)
	private String prenom;
	
	@Column(name="ACTIF")
	private boolean enabled;

	//bi-directional many-to-many association to Adresse
	@ManyToMany(mappedBy="clients", cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	private Set<Adresse> adresses = new HashSet<>(0);

	//bi-directional many-to-many association to Article
	@ManyToMany
	@JoinTable(
		name="liste_de_souhaits"
		, joinColumns={
			@JoinColumn(name="ID_CLIENT", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ARTICLE", nullable=false)
			}
		)
	private Set<Article> articles;

	//bi-directional one-to-one association to Utilisateur
	@OneToOne
	@JoinColumn(name="ID_UTILISATEUR", nullable=false)
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="client")
	private Set<Commande> commandes;

	//bi-directional many-to-one association to Commentaire
	@OneToMany(mappedBy="client")
	private Set<Commentaire> commentaires;

	public Client() {
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public Set<Adresse> getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Set<Adresse> adresses) {
		this.adresses = adresses;
	}
	
	public Adresse getFirstAdresse(){
		if (! adresses.isEmpty() ) {
			return adresses.iterator().next();
		}
		return null;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
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
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}