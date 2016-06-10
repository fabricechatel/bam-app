package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the commentaire database table.
 * 
 */
@Entity
@NamedQuery(name="Commentaire.findAll", query="SELECT c FROM Commentaire c")
public class Commentaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_COMMENTAIRE")
	private int idCommentaire;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private BigDecimal note;

	private byte visible;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="ID_ARTICLE")
	private Article article;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	public Commentaire() {
	}

	public int getIdCommentaire() {
		return this.idCommentaire;
	}

	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getNote() {
		return this.note;
	}

	public void setNote(BigDecimal note) {
		this.note = note;
	}

	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}