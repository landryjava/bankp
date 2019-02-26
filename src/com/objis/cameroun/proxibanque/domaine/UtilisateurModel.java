package com.objis.cameroun.proxibanque.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class UtilisateurModel extends AbstractTableModel{
	
	private final String[] entetes = {"Numero","Login", "Password","Role","Nom","Prénom","Email","Téléphone"};
	private List<Utilisateur> listeUtilisateurs;
	

	public UtilisateurModel(List<Utilisateur> listeUtilisateurs) {
		super();
		this.listeUtilisateurs = listeUtilisateurs;
	}

	public List<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}

	public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
		this.listeUtilisateurs = listeUtilisateurs;
	}

	public int getColumnCount() {
		
		return entetes.length;
	}

	public int getRowCount() {
	
		return listeUtilisateurs.size();
	}
	
	@Override
    // retourne le nom du champ d'une colonne
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch(columnIndex) {
		
		case 0:
			return listeUtilisateurs.get(rowIndex).getIdPers();
		case 1:
			return listeUtilisateurs.get(rowIndex).getLogin();
		case 2:
			return listeUtilisateurs.get(rowIndex).getPassword();
		case 3:
			return listeUtilisateurs.get(rowIndex).getRole();
		case 4:
			return listeUtilisateurs.get(rowIndex).getNomPers();
		case 5:
			return listeUtilisateurs.get(rowIndex).getPrenomPers();
		case 6:
			return listeUtilisateurs.get(rowIndex).getEmail();
		case 7:
			return listeUtilisateurs.get(rowIndex).getTelephonePers();
		default:
			throw new IllegalArgumentException();
		
		}
	}

}
