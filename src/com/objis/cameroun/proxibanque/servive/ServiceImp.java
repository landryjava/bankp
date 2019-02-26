package com.objis.cameroun.proxibanque.servive;

import java.security.Provider.Service;
import java.util.List;

import com.objis.cameroun.proxibanque.dao.DaoImpl;
import com.objis.cameroun.proxibanque.dao.IDao;
import com.objis.cameroun.proxibanque.domaine.Client;
import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.domaine.Utilisateur;

public class ServiceImp implements IService{
	
	private IDao dao;
	
	public ServiceImp() {
		
		dao=new DaoImpl();
	}

	public int ajouterRoleService(Role role) {
		return dao.ajouterRoleDao(role);
		
		
	}

	public int creerUtilisteurService(Utilisateur user) {
		return dao.creerUtilisteurDao(user);
	}

	public int creerClientService(Client cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void faireVirementCompteACompteService(float lg, String st, String str) {
		dao.faireVirementCompteACompteDao(lg, st, str);
	}

	public void gererPatrimoineService(long lg, long lgn, String st) {
		// TODO Auto-generated method stub
		
	}

	public void lireInfoClientService(Client cli) {
		// TODO Auto-generated method stub
		
	}

	public int modifierInfoClientService(Client cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void simulerCreditService(long lg, String st) {
		// TODO Auto-generated method stub
		
	}

	public int authentifierService(String login, String passwd) {
		return dao.authentifierDao(login, passwd);
	}

	public String recupererRoleService(String login, String passwd) {
		
		return dao.recupererRoleDao(login, passwd);
	}

	public int modifierRoleUserService(String nom, String role) {
		return dao.modifierRoleUserDao(nom, role);
	}

	public List<Utilisateur> listeUtilisateursService() {
		return dao.listeUtilisateursDao();
	}

}
