package com.bam.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@Table(name="utilisateur")
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_UTILISATEUR", unique=true, nullable=false)
	private int idUtilisateur;

	@Column(nullable=false, length=64)
	private String login;

	@Column(nullable=false, length=64)
	private String mdp;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="utilisateur1", fetch=FetchType.EAGER)
	private Set<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="utilisateur2", fetch=FetchType.EAGER)
	private Set<Message> messages2;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ID_ROLE", nullable=false)
	private Role role;

	public Utilisateur() {
	}

	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}