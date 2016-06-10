package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the liens_commande_adresse database table.
 * 
 */
@Entity
@Table(name="liens_commande_adresse")
@NamedQuery(name="LiensCommandeAdresse.findAll", query="SELECT l FROM LiensCommandeAdresse l")
public class LiensCommandeAdresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LiensCommandeAdressePK id;

	private byte isfacturation;

	//bi-directional many-to-one association to Adresse
	@ManyToOne
	@JoinColumn(name="ID_ADRESSE")
	private Adresse adresse;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="ID_COMMANDE")
	private Commande commande;

	public LiensCommandeAdresse() {
	}

	public LiensCommandeAdressePK getId() {
		return this.id;
	}

	public void setId(LiensCommandeAdressePK id) {
		this.id = id;
	}

	public byte getIsfacturation() {
		return this.isfacturation;
	}

	public void setIsfacturation(byte isfacturation) {
		this.isfacturation = isfacturation;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}