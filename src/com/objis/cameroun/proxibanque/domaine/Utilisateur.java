package com.objis.cameroun.proxibanque.domaine;

public class Utilisateur extends Personne {
	
	private String email;
	private String login;
	private String password;
	private String role;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String idPers, String nomPers, String prenomPers, String telephonePers) {
		super(idPers, nomPers, prenomPers, telephonePers);
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nomPers, String prenomPers, String telephonePers) {
		super(nomPers, prenomPers, telephonePers);
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String toString() {
		return "Utilisateur [email=" + email + ", login=" + login + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
