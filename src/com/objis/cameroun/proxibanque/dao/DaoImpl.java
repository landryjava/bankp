package com.objis.cameroun.proxibanque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.proxibanque.domaine.Client;
import com.objis.cameroun.proxibanque.domaine.CompteBancaire;
import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.domaine.Utilisateur;

public class DaoImpl implements IDao {

	public int ajouterRoleDao(Role role) {
		try {
			Connection cn= ConnectionMysqlDB.getInstance();
			
			String sql= "insert into `role`(`libele`)"+"values (?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			
			ps.setString(1, role.getLibeleRole());
			ps.executeUpdate();
			return 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int creerUtilisteurDao(Utilisateur user) {
		
		try {
			
			Connection cn= ConnectionMysqlDB.getInstance();
			
			String sql = "insert into `useraccount`(`login`,`mdp`,`role`,`nomuser`,`prenomuser`,`emailuser`,`teluser`)" 
					+"values (?,?,?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			
			ps.setString(1, user.getLogin());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getRole());
			ps.setString(4, user.getNomPers());
			ps.setString(5, user.getPrenomPers());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getTelephonePers());
			
			ps.executeUpdate();
			return 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int creerClientDao(Client cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void faireVirementCompteACompteDao(float lg, String st, String str) {
		
		debiterCompteDao(st, lg);
		crediterCompteDao(str, lg);
	}

	public void gererPatrimoineDao(long lg, long lgn, String st) {
		// TODO Auto-generated method stub
		
	}

	public void lireInfoClientDao(Client cli) {
		// TODO Auto-generated method stub
		
	}

	public int modifierInfoClientDao(Client cli) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void simulerCreditDao(long lg, String st) {
		// TODO Auto-generated method stub
		
	}

	public int authentifierDao(String login, String passwd) {
		List<Utilisateur> maliste= new ArrayList<Utilisateur>();
	
		try {
			
			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMysqlDB.getInstance();
			
			// Etape 2 : Création d'un objet  statement et preparation de la requete
			
			String sql= "SELECT * FROM `useraccount` WHERE login='"+login+"' AND mdp= '"+passwd+"' ";
			
			// creation d'un objet statement
			Statement st = cn.createStatement();
			
			// Excécution de la requete
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Utilisateur user= new Utilisateur();
				
				user.setNomPers(rs.getString("nomuser"));
				user.setPrenomPers(rs.getString("prenomuser"));
				user.setTelephonePers(rs.getString("teluser"));
				user.setEmail(rs.getString("emailuser"));
				user.setRole(rs.getString("role"));
				
				maliste.add(user);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(maliste.isEmpty()==true) {
			return 0;
		}else {
			return 1;
		}
	}

	public String recupererRoleDao(String login, String passwd) {
		
		List<Utilisateur> maliste= new ArrayList<Utilisateur>();
		String role;
		
		try {
			
			// Etape 1 : récupération de la connexion
				Connection cn = ConnectionMysqlDB.getInstance();
						
			// Etape 2 : Création d'un objet  statement et preparation de la requete
			String sql= "SELECT * FROM `useraccount` WHERE login='"+login+"' AND mdp= '"+passwd+"'";
			
			// creation d'un objet statement
			Statement st = cn.createStatement();
						
			// Excécution de la requete
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				
				Utilisateur user1= new Utilisateur();
		
				user1.setNomPers(rs.getString("nomuser"));
				user1.setPrenomPers(rs.getString("prenomuser"));
				user1.setTelephonePers(rs.getString("teluser"));
				user1.setEmail(rs.getString("emailuser"));
				user1.setRole(rs.getString("role"));
				
				maliste.add(user1);
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(maliste.isEmpty()==true) {
			
			return null;
		}else {
			return maliste.get(0).getRole();
		}
	}

	public int modifierRoleUserDao(String nom, String role) {
		try {
			Connection cn= ConnectionMysqlDB.getInstance();
			
//			String sql= "UPDATE `bdname`.`useraccount` SET `role` = '"+role+"' WHERE `nomuser` = '"+nom+"'";

			
			String sql= "UPDATE `useraccount` SET `role` = '"+role+"' WHERE `nomuser` = '"+nom+"'";

			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.executeUpdate();
			return 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void crediterCompteDao(String numCompte, float montant) {
		
		List<CompteBancaire> maListe= new ArrayList<CompteBancaire>();
		try {
			Connection cn= ConnectionMysqlDB.getInstance();
			float newSolde;
			
			String sql1= "SELECT `solcb` FROM `comptebancaire` WHERE `numcb`='"+numCompte+"'";
			
			// creation d'un objet statement
			Statement st = cn.createStatement();
									
			// Excécution de la requete
			ResultSet rs = st.executeQuery(sql1);
						
			while (rs.next()) {
				CompteBancaire compte= new CompteBancaire();
				
				compte.setSolde(rs.getLong("solcb"));
				
				maListe.add(compte);
				
			}
			
			newSolde= ((maListe.get(0).getSolde()) + montant);
			
			String sql2= "UPDATE `bdproxibanque`.`comptebancaire` SET `solcb` = '"+newSolde+"' WHERE `numcb` = '"+numCompte+"'";
			
			PreparedStatement ps=  cn.prepareStatement(sql2);
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void debiterCompteDao(String numCompte, float montant) {
		List<CompteBancaire> maListe= new ArrayList<CompteBancaire>();
		
		try {
			
			Connection cn= ConnectionMysqlDB.getInstance();
			float newSolde;
			
			String sql1= "SELECT `solcb` FROM `comptebancaire` WHERE `numcb`='"+numCompte+"'";
			
			// creation d'un objet statement
			Statement st = cn.createStatement();
												
			// Excécution de la requete
			ResultSet rs = st.executeQuery(sql1);
			
			while (rs.next()) {
				
				CompteBancaire compte= new CompteBancaire();
				
				compte.setSolde(rs.getLong("solcb"));
				
				maListe.add(compte);
			}
			
			newSolde= ((maListe.get(0).getSolde()) - montant);
			
			String sql2= "UPDATE `dbname`.`comptebancaire` SET `solcb` = '"+newSolde+"' WHERE `numcb` = '"+numCompte+"'";
			
			PreparedStatement ps=  cn.prepareStatement(sql2);
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public List<Utilisateur> listeUtilisateursDao() {
		
		List<Utilisateur> maListe= new ArrayList<Utilisateur>();
		try {
			Connection cn= ConnectionMysqlDB.getInstance();
			
			String sql= "SELECT * FROM `useraccount`";
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Utilisateur user= new Utilisateur();
				
				user.setIdPers(rs.getString("iduse"));
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("mdp"));
				user.setRole(rs.getString("role"));
				user.setNomPers(rs.getString("nomuser"));
				user.setPrenomPers(rs.getString("prenomuser"));
				user.setEmail(rs.getString("emailuser"));
				user.setTelephonePers(rs.getString("teluser"));
				
				maListe.add(user);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return maListe;
	}

}
