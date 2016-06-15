package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the panier database table.
 * 
 */
@Entity
@NamedQuery(name="Panier.findAll", query="SELECT p FROM Panier p")
public class Panier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpanier;

	private String refinternaute;

	//bi-directional many-to-one association to LiensPanierArticle
	@OneToMany(mappedBy="panier",fetch=FetchType.EAGER)
	private List<LiensPanierArticle> liensPanierArticles;

	//bi-directional many-to-one association to Client
	@OneToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	public Panier() {
	}
	
	public Panier(String refinternaute, Client client) {
		super();
		this.refinternaute = refinternaute;
		this.client = client;
	}

	public int getIdpanier() {
		return this.idpanier;
	}

	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}

	public String getRefinternaute() {
		return this.refinternaute;
	}

	public void setRefinternaute(String refinternaute) {
		this.refinternaute = refinternaute;
	}

	public List<LiensPanierArticle> getLiensPanierArticles() {
		return this.liensPanierArticles;
	}

	public void setLiensPanierArticles(List<LiensPanierArticle> liensPanierArticles) {
		this.liensPanierArticles = liensPanierArticles;
	}

	public LiensPanierArticle addLiensPanierArticle(LiensPanierArticle liensPanierArticle) {
		getLiensPanierArticles().add(liensPanierArticle);
		liensPanierArticle.setPanier(this);

		return liensPanierArticle;
	}

	public LiensPanierArticle removeLiensPanierArticle(LiensPanierArticle liensPanierArticle) {
		getLiensPanierArticles().remove(liensPanierArticle);
		liensPanierArticle.setPanier(null);

		return liensPanierArticle;
	}

	@Override
	public String toString() {
		return "Panier [idpanier=" + idpanier + ", refinternaute="
				+ refinternaute + ", liensPanierArticles="
				+ liensPanierArticles + ", client=" + client + "]";
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}