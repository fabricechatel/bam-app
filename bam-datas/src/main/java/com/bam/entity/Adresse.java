package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
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

	@Column(name="CODE_POSTAL", nullable=false, length=16)
	private String codePostal;

	@Column(nullable=false, length=16)
	private String numero;

	@Column(nullable=false, length=64)
	private String ville;

	@Column(nullable=false, length=128)
	private String voie;

	//bi-directional many-to-many association to Commande
	@ManyToMany(mappedBy="adresses", cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<Commande> commandes;

	//bi-directional many-to-many association to Client
	@ManyToMany(mappedBy="adresses", fetch=FetchType.EAGER)
	private Set<Client> clients;

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

	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}