package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@Table(name="message")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_MESSAGE", unique=true, nullable=false)
	private int idMessage;

	@Column(name="CORPS_MESSAGE", nullable=false, length=1024)
	private String corpsMessage;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_MESSAGE", nullable=false)
	private Date dateMessage;

	@Column(name="ID_SENDER", nullable=false)
	private int idSender;

	@Column(nullable=false, length=64)
	private String intitule;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_RECEIVER", nullable=false)
	private Utilisateur utilisateur;

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

	public int getIdSender() {
		return this.idSender;
	}

	public void setIdSender(int idSender) {
		this.idSender = idSender;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}