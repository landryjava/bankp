package com.objis.cameroun.proxibanque.domaine;

public class Agence {

	private int idAgence;
	private String dateCreationAgen;
	
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(int idAgence, String dateCreationAgen) {
		super();
		this.idAgence = idAgence;
		this.dateCreationAgen = dateCreationAgen;
	}

	public Agence(String dateCreationAgen) {
		super();
		this.dateCreationAgen = dateCreationAgen;
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public String getDateCreationAgen() {
		return dateCreationAgen;
	}

	public void setDateCreationAgen(String dateCreationAgen) {
		this.dateCreationAgen = dateCreationAgen;
	}

	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateCreationAgen="
				+ dateCreationAgen + "]";
	}
	
	
	
	
}
