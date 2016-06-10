package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the liens_commande_adresse database table.
 * 
 */
@Embeddable
public class LiensCommandeAdressePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_COMMANDE", insertable=false, updatable=false)
	private int idCommande;

	@Column(name="ID_ADRESSE", insertable=false, updatable=false)
	private int idAdresse;

	public LiensCommandeAdressePK() {
	}
	public int getIdCommande() {
		return this.idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public int getIdAdresse() {
		return this.idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LiensCommandeAdressePK)) {
			return false;
		}
		LiensCommandeAdressePK castOther = (LiensCommandeAdressePK)other;
		return 
			(this.idCommande == castOther.idCommande)
			&& (this.idAdresse == castOther.idAdresse);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCommande;
		hash = hash * prime + this.idAdresse;
		
		return hash;
	}
}