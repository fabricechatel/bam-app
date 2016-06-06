package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ligne_commande database table.
 * 
 */
@Embeddable
public class LigneCommandePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_COMMANDE", insertable=false, updatable=false, unique=true, nullable=false)
	private int idCommande;

	@Column(name="ID_ARTICLE", insertable=false, updatable=false, unique=true, nullable=false)
	private int idArticle;

	public LigneCommandePK() {
	}
	public int getIdCommande() {
		return this.idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public int getIdArticle() {
		return this.idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LigneCommandePK)) {
			return false;
		}
		LigneCommandePK castOther = (LigneCommandePK)other;
		return 
			(this.idCommande == castOther.idCommande)
			&& (this.idArticle == castOther.idArticle);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCommande;
		hash = hash * prime + this.idArticle;
		
		return hash;
	}
}