package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the adresse database table.
 * 
 */
@Entity
@NamedQuery(name="Adresse.findAll", query="SELECT a FROM Adresse a")
public class Adresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ADRESSE")
	private int idAdresse;

	@Column(name="CODE_POSTAL")
	private String codePostal;

	private String numero;

	private String ville;

	private String voie;

	//bi-directional many-to-many association to Client
	@ManyToMany(mappedBy="adresses")
	private Set<Client> clients;

	//bi-directional many-to-one association to LiensCommandeAdresse
	@OneToMany(mappedBy="adresse")
	private Set<LiensCommandeAdresse> liensCommandeAdresses;

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

	public Set<LiensCommandeAdresse> getLiensCommandeAdresses() {
		return this.liensCommandeAdresses;
	}

	public void setLiensCommandeAdresses(Set<LiensCommandeAdresse> liensCommandeAdresses) {
		this.liensCommandeAdresses = liensCommandeAdresses;
	}

	public LiensCommandeAdresse addLiensCommandeAdress(LiensCommandeAdresse liensCommandeAdress) {
		getLiensCommandeAdresses().add(liensCommandeAdress);
		liensCommandeAdress.setAdresse(this);

		return liensCommandeAdress;
	}

	public LiensCommandeAdresse removeLiensCommandeAdress(LiensCommandeAdresse liensCommandeAdress) {
		getLiensCommandeAdresses().remove(liensCommandeAdress);
		liensCommandeAdress.setAdresse(null);

		return liensCommandeAdress;
	}

}