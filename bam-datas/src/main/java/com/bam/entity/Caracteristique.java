package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the caracteristique database table.
 * 
 */
@Entity
@Table(name="caracteristique")
@NamedQuery(name="Caracteristique.findAll", query="SELECT c FROM Caracteristique c")
public class Caracteristique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CARACTERISTIQUE", unique=true, nullable=false)
	private int idCaracteristique;

	@Column(nullable=false, length=128)
	private String valeur;

	public Caracteristique() {
	}

	public int getIdCaracteristique() {
		return this.idCaracteristique;
	}

	public void setIdCaracteristique(int idCaracteristique) {
		this.idCaracteristique = idCaracteristique;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}