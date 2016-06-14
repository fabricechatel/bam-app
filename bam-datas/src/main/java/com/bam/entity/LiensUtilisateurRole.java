package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the liens_utilisateur_role database table.
 * 
 */
@Entity
@Table(name="liens_utilisateur_role")
@NamedQuery(name="LiensUtilisateurRole.findAll", query="SELECT l FROM LiensUtilisateurRole l")
public class LiensUtilisateurRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LiensUtilisateurRolePK id;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_UTILISATEUR", insertable=false, updatable=false)
	private Utilisateur utilisateur;

	public LiensUtilisateurRole() {
	}

	public LiensUtilisateurRolePK getId() {
		return this.id;
	}

	public void setId(LiensUtilisateurRolePK id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}