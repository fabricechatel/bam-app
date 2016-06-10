package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_COMMANDE")
	private int idCommande;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_PAIEMENT")
	private Date datePaiement;

	@Column(name="IS_CANCELLED")
	private byte isCancelled;

	@Column(name="MONTANT_TOTAL")
	private BigDecimal montantTotal;

	private String numerocommande;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	//bi-directional many-to-one association to LiensCommandeAdresse
	@OneToMany(mappedBy="commande")
	private Set<LiensCommandeAdresse> liensCommandeAdresses;

	//bi-directional many-to-one association to LigneCommande
	@OneToMany(mappedBy="commande")
	private Set<LigneCommande> ligneCommandes;

	public Commande() {
	}

	public int getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDatePaiement() {
		return this.datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public byte getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(byte isCancelled) {
		this.isCancelled = isCancelled;
	}

	public BigDecimal getMontantTotal() {
		return this.montantTotal;
	}

	public void setMontantTotal(BigDecimal montantTotal) {
		this.montantTotal = montantTotal;
	}

	public String getNumerocommande() {
		return this.numerocommande;
	}

	public void setNumerocommande(String numerocommande) {
		this.numerocommande = numerocommande;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<LiensCommandeAdresse> getLiensCommandeAdresses() {
		return this.liensCommandeAdresses;
	}

	public void setLiensCommandeAdresses(Set<LiensCommandeAdresse> liensCommandeAdresses) {
		this.liensCommandeAdresses = liensCommandeAdresses;
	}

	public LiensCommandeAdresse addLiensCommandeAdress(LiensCommandeAdresse liensCommandeAdress) {
		getLiensCommandeAdresses().add(liensCommandeAdress);
		liensCommandeAdress.setCommande(this);

		return liensCommandeAdress;
	}

	public LiensCommandeAdresse removeLiensCommandeAdress(LiensCommandeAdresse liensCommandeAdress) {
		getLiensCommandeAdresses().remove(liensCommandeAdress);
		liensCommandeAdress.setCommande(null);

		return liensCommandeAdress;
	}

	public Set<LigneCommande> getLigneCommandes() {
		return this.ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public LigneCommande addLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().add(ligneCommande);
		ligneCommande.setCommande(this);

		return ligneCommande;
	}

	public LigneCommande removeLigneCommande(LigneCommande ligneCommande) {
		getLigneCommandes().remove(ligneCommande);
		ligneCommande.setCommande(null);

		return ligneCommande;
	}

}