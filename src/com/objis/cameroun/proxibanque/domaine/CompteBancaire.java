package com.objis.cameroun.proxibanque.domaine;

public class CompteBancaire {

	private int idCompte;
	private String dateOuverture;
	private String NumCompte;
	private String typeCompte;
	private float solde;
	
	public CompteBancaire(int idCompte, String dateOuverture, String numCompte, String typeCompte, float solde) {
		super();
		this.idCompte = idCompte;
		this.dateOuverture = dateOuverture;
		NumCompte = numCompte;
		this.typeCompte = typeCompte;
		this.solde = solde;
	}

	

	public CompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getNumCompte() {
		return NumCompte;
	}

	public void setNumCompte(String numCompte) {
		NumCompte = numCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", dateOuverture=" + dateOuverture + ", NumCompte=" + NumCompte
				+ ", typeCompte=" + typeCompte + ", solde=" + solde + "]";
	}
	
	
	
}
