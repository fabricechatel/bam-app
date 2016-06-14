package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the liens_utilisateur_role database table.
 * 
 */
@Embeddable
public class LiensUtilisateurRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_ROLE")
	private int idRole;

	@Column(name="ID_UTILISATEUR", insertable=false, updatable=false)
	private int idUtilisateur;

	public LiensUtilisateurRolePK() {
	}
	public int getIdRole() {
		return this.idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LiensUtilisateurRolePK)) {
			return false;
		}
		LiensUtilisateurRolePK castOther = (LiensUtilisateurRolePK)other;
		return 
			(this.idRole == castOther.idRole)
			&& (this.idUtilisateur == castOther.idUtilisateur);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRole;
		hash = hash * prime + this.idUtilisateur;
		
		return hash;
	}
}