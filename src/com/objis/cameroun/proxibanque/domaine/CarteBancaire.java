package com.objis.cameroun.proxibanque.domaine;

public class CarteBancaire {
	
	private int idCart;
	private String libelle;
	
	public CarteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarteBancaire(int idCart, String libelle) {
		super();
		this.idCart = idCart;
		this.libelle = libelle;
	}

	public CarteBancaire(String libelle) {
		super();
		this.libelle = libelle;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String toString() {
		return "CarteBancaire [idCart=" + idCart + ", libelle=" + libelle + "]";
	}
	
	

	
}
