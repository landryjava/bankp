package com.objis.cameroun.proxibanque.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class AgenceModel extends AbstractTableModel {

    private final String[] entetes = {"Numero","IdAgences", "Datecreation","Employe"};

    private List<Agence> agences;

    public AgenceModel(List<Agence>  agences) {  
        this.agences =  agences; 
    }


    public List<Agence> getAgences() {
		return agences;
	}

	public void setAgences(List<Agence>  agences) {
		this.agences = agences;
	}



	public int getRowCount() {
        return agences.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

   
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return agences.get(rowIndex).getIdAgences();

            case 1:
                // Noms
                return agences.get(rowIndex).getDateCreation();
            case 2:
                // Prenoms
                return agences.get(rowIndex).getEmploye();
          
              
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
