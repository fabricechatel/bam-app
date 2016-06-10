package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_MESSAGE")
	private int idMessage;

	@Column(name="CORPS_MESSAGE")
	private String corpsMessage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MESSAGE")
	private Date dateMessage;

	private String intitule;

	private byte lu;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_RECEIVER")
	private Utilisateur utilisateur1;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_SENDER")
	private Utilisateur utilisateur2;

	public Message() {
	}

	public int getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public String getCorpsMessage() {
		return this.corpsMessage;
	}

	public void setCorpsMessage(String corpsMessage) {
		this.corpsMessage = corpsMessage;
	}

	public Date getDateMessage() {
		return this.dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public byte getLu() {
		return this.lu;
	}

	public void setLu(byte lu) {
		this.lu = lu;
	}

	public Utilisateur getUtilisateur1() {
		return this.utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public Utilisateur getUtilisateur2() {
		return this.utilisateur2;
	}

	public void setUtilisateur2(Utilisateur utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}

}