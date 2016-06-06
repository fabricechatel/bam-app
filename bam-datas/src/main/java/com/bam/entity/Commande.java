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
@Table(name="commande")
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_COMMANDE", unique=true, nullable=false)
	private int idCommande;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_PAIEMENT", nullable=false)
	private Date datePaiement;

	@Column(name="IS_CANCELLED", nullable=false)
	private Object isCancelled;

	@Column(name="MONTANT_TOTAL", nullable=false, precision=10)
	private BigDecimal montantTotal;

	@Column(nullable=false, length=64)
	private String numerocommande;

	//bi-directional many-to-many association to Adresse
	@ManyToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable(
		name="liens_commande_adresse"
		, joinColumns={
			@JoinColumn(name="ID_COMMANDE", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ADRESSE", nullable=false)
			}
		)
	private Set<Adresse> adresses;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="ID_CLIENT", nullable=false)
	private Client client;

	//bi-directional many-to-one association to LigneCommande
	@OneToMany(mappedBy="commande", fetch=FetchType.EAGER)
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

	public Object getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(Object isCancelled) {
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

	public Set<Adresse> getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Set<Adresse> adresses) {
		this.adresses = adresses;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
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