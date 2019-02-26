package com.objis.cameroun.proxibanque.servive;

import java.util.List;

import com.objis.cameroun.proxibanque.domaine.Client;
import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.domaine.Utilisateur;

public interface IService {

	
	// Service pour l'Administrateur
	
	public int ajouterRoleService(Role role);
	public int creerUtilisteurService(Utilisateur user);
	public List<Utilisateur> listeUtilisateursService();
	
	// Service pour le Conseiller
	public int creerClientService(Client cli);
	public void faireVirementCompteACompteService(float lg,String st,String str);
	public void gererPatrimoineService(long lg,long lgn, String st);
	public void lireInfoClientService(Client cli);
	public int modifierInfoClientService(Client cli);
	public void simulerCreditService(long lg, String st);
	
	public int authentifierService(String login, String passwd);
	public String recupererRoleService(String login, String passwd);
	public int modifierRoleUserService(String nom, String role);
	
	
	
}
