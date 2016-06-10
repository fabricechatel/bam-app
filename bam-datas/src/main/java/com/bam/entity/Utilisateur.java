package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_UTILISATEUR")
	private int idUtilisateur;

	private byte actif;

	private String login;

	private String mdp;

	//bi-directional one-to-one association to Client
	@OneToOne(mappedBy="utilisateur")
	private Client client;

	//bi-directional many-to-one association to LiensUtilisateurRole
	@OneToMany(mappedBy="utilisateur")
	private Set<LiensUtilisateurRole> liensUtilisateurRoles;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="utilisateur1")
	private Set<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="utilisateur2")
	private Set<Message> messages2;

	public Utilisateur() {
	}

	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public byte getActif() {
		return this.actif;
	}

	public void setActif(byte actif) {
		this.actif = actif;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<LiensUtilisateurRole> getLiensUtilisateurRoles() {
		return this.liensUtilisateurRoles;
	}

	public void setLiensUtilisateurRoles(Set<LiensUtilisateurRole> liensUtilisateurRoles) {
		this.liensUtilisateurRoles = liensUtilisateurRoles;
	}

	public LiensUtilisateurRole addLiensUtilisateurRole(LiensUtilisateurRole liensUtilisateurRole) {
		getLiensUtilisateurRoles().add(liensUtilisateurRole);
		liensUtilisateurRole.setUtilisateur(this);

		return liensUtilisateurRole;
	}

	public LiensUtilisateurRole removeLiensUtilisateurRole(LiensUtilisateurRole liensUtilisateurRole) {
		getLiensUtilisateurRoles().remove(liensUtilisateurRole);
		liensUtilisateurRole.setUtilisateur(null);

		return liensUtilisateurRole;
	}

	public Set<Message> getMessages1() {
		return this.messages1;
	}

	public void setMessages1(Set<Message> messages1) {
		this.messages1 = messages1;
	}

	public Message addMessages1(Message messages1) {
		getMessages1().add(messages1);
		messages1.setUtilisateur1(this);

		return messages1;
	}

	public Message removeMessages1(Message messages1) {
		getMessages1().remove(messages1);
		messages1.setUtilisateur1(null);

		return messages1;
	}

	public Set<Message> getMessages2() {
		return this.messages2;
	}

	public void setMessages2(Set<Message> messages2) {
		this.messages2 = messages2;
	}

	public Message addMessages2(Message messages2) {
		getMessages2().add(messages2);
		messages2.setUtilisateur2(this);

		return messages2;
	}

	public Message removeMessages2(Message messages2) {
		getMessages2().remove(messages2);
		messages2.setUtilisateur2(null);

		return messages2;
	}

}