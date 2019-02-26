package com.objis.cameroun.proxibanque.dao;

import java.util.List;

import com.objis.cameroun.proxibanque.domaine.Client;
import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.domaine.Utilisateur;

public interface IDao {
	
	// Methode pour l'Administrateur
	
	public int ajouterRoleDao(Role role);
	public int creerUtilisteurDao(Utilisateur user);
	public List<Utilisateur> listeUtilisateursDao();
	
	// Methode pour le Conseiller
	public int creerClientDao(Client cli);
	public void faireVirementCompteACompteDao(float lg,String st,String str);
	public void gererPatrimoineDao(long lg,long lgn, String st);
	public void lireInfoClientDao(Client cli);
	public int modifierInfoClientDao(Client cli);
	public void simulerCreditDao(long lg, String st);
	
	public void crediterCompteDao(String numCompte, float montant);
	public void debiterCompteDao(String numCompte, float montant);
	
	public int authentifierDao(String login, String passwd);
	public String recupererRoleDao(String login, String passwd);
	public int modifierRoleUserDao(String nom, String role);
	
	

}
