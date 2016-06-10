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

	//bi-directional one-to-one association to Client
	@OneToOne(mappedBy="utilisateur")
	private Client client;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="sender")
	private Set<Message> messagesSended;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="receiver")
	private Set<Message> messagesReceived;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ID_ROLE")
	private Role role;

	public Utilisateur() {
	}
	
	public Utilisateur(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
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

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Message> getMessagesSended() {
		return this.messagesSended;
	}

	public void setMessagesSended(Set<Message> messagesSended) {
		this.messagesSended = messagesSended;
	}

	public Message addMessagesSended(Message messagesSended) {
		getMessagesSended().add(messagesSended);
		messagesSended.setSender(this);

		return messagesSended;
	}

	public Message removeMessagesSended(Message messagesSended) {
		getMessagesSended().remove(messagesSended);
		messagesSended.setSender(null);

		return messagesSended;
	}

	public Set<Message> getMessagesReceived() {
		return this.messagesReceived;
	}

	public void setMessagesReceived(Set<Message> messagesReceived) {
		this.messagesReceived = messagesReceived;
	}

	public Message addMessagesReceived(Message messagesReceived) {
		getMessagesReceived().add(messagesReceived);
		messagesReceived.setReceiver(this);

		return messagesReceived;
	}

	public Message removeMessagesReceived(Message messagesReceived) {
		getMessagesReceived().remove(messagesReceived);
		messagesReceived.setReceiver(null);

		return messagesReceived;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}