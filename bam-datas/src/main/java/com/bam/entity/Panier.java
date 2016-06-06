package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the panier database table.
 * 
 */
@Entity
@Table(name="panier")
@NamedQuery(name="Panier.findAll", query="SELECT p FROM Panier p")
public class Panier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idpanier;

	@Column(name="ID_CLIENT")
	private int idClient;

	@Column(nullable=false, length=64)
	private String refinternaute;

	public Panier() {
	}

	public int getIdpanier() {
		return this.idpanier;
	}

	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getRefinternaute() {
		return this.refinternaute;
	}

	public void setRefinternaute(String refinternaute) {
		this.refinternaute = refinternaute;
	}

}