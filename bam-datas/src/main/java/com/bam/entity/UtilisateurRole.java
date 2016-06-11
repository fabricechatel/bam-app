package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the utilisateur_roles database table.
 * 
 */
@Entity
@Table(name="utilisateur_roles")
@NamedQuery(name="UtilisateurRole.findAll", query="SELECT u FROM UtilisateurRole u")
public class UtilisateurRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idutilisateurrole;

	private boolean enabled;

	private String nomrole;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_UTILISATEUR")
	private Utilisateur utilisateur;

	public UtilisateurRole() {
	}

	public int getIdutilisateurrole() {
		return this.idutilisateurrole;
	}

	public void setIdutilisateurrole(int idutilisateurrole) {
		this.idutilisateurrole = idutilisateurrole;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getNomrole() {
		return this.nomrole;
	}

	public void setNomrole(String nomrole) {
		this.nomrole = nomrole;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}