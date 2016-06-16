package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the liens_panier_article database table.
 * 
 */
@Embeddable
public class LiensPanierArticlePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(updatable=false)
	private int idpanier;

	@Column(name="ID_ARTICLE", updatable=false)
	private int idArticle;

	public LiensPanierArticlePK() {
	}
	public int getIdpanier() {
		return this.idpanier;
	}
	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
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
		if (!(other instanceof LiensPanierArticlePK)) {
			return false;
		}
		LiensPanierArticlePK castOther = (LiensPanierArticlePK)other;
		return 
			(this.idpanier == castOther.idpanier)
			&& (this.idArticle == castOther.idArticle);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idpanier;
		hash = hash * prime + this.idArticle;
		
		return hash;
	}
}