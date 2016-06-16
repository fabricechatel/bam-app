package com.bam.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the adresse database table.
 * 
 */
@Entity
@Table(name="adresse")
@NamedQuery(name="Adresse.findAll", query="SELECT a FROM Adresse a")
public class Adresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ADRESSE", unique=true, nullable=false)
	private int idAdresse;

	@Column(name="CODE_POSTAL", length=16)
	private String codePostal;

	@Column(length=16)
	private String numero;

	@Column(length=64)
	private String ville;

	@Column(length=128)
	private String voie;

	//bi-directional many-to-many association to Client
	@ManyToMany
	@JoinTable(
		name="liens_client_adresse"
		, joinColumns={
			@JoinColumn(name="ID_ADRESSE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CLIENT", nullable=false)
			}
		)
	private Set<Client> clients = new HashSet<>(0);

	//bi-directional many-to-many association to Commande
	@ManyToMany
	@JoinTable(
		name="liens_commande_adresse"
		, joinColumns={
			@JoinColumn(name="ID_ADRESSE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_COMMANDE", nullable=false)
			}
		)
	private Set<Commande> commandes;

	public Adresse() {
	}

	public int getIdAdresse() {
		return this.idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getVoie() {
		return this.voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", codePostal=" + codePostal
				+ ", numero=" + numero + ", ville=" + ville + ", voie=" + voie
				+ "]";
	}
	
	public String getComplete() {
		return  numero + ", " + voie + " " + codePostal + " " + ville;
	}
	

}