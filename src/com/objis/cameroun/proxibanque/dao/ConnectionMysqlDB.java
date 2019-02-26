package com.objis.cameroun.proxibanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysqlDB {

	
	// Information d'accès à la base de données
	public static String dbname = "bdproxybank";
	public static String url = "jdbc:mysql://localhost/"+dbname;
	public static String login = "root";//nom d'utilisateur de la base des données
	public static String passwd = "";//mot de pass
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection à :"+dbname);
				
			}
			
		}
		
		return connection;
		
	}

}
