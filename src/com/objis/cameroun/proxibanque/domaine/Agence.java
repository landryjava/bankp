package com.objis.cameroun.proxibanque.domaine;

public class Agence {
    private String nom;
	private int idAgence;
	private String idAgences;
	private String dateCreation;
	private String employe;
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(int idAgence, String dateCreation) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmploye() {
		return employe;
	}

	public void setEmploye(String employe) {
		this.employe = employe;
	}

	public Agence(String nom, String idAgences, String dateCreation, String employe) {
		super();
		this.nom = nom;
		this.idAgences = idAgences;
		this.dateCreation = dateCreation;
		this.employe = employe;
	}

	public void setIdAgences(String idAgences) {
		this.idAgences = idAgences;
	}
	public String getIdAgences() {
		return idAgences;
	}

	@Override
	public String toString() {
		return "Agence [nom=" + nom + ", idAgence=" + idAgence + ", idAgences=" + idAgences + ", dateCreation="
				+ dateCreation + ", employe=" + employe + "]";
	}



	}
	
	

