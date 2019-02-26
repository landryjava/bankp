package com.objis.cameroun.proxibanque.domaine;

public class Client extends Personne {

	private String adresseCli;
	private String codePostalCli;
	private String professionCli;
	private String villeCli;
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String idPers, String nomPers, String prenomPers,
			String telephonePers) {
		super(idPers, nomPers, prenomPers, telephonePers);
		// TODO Auto-generated constructor stub
	}
	public Client(String nomPers, String prenomPers, String telephonePers) {
		super(nomPers, prenomPers, telephonePers);
		// TODO Auto-generated constructor stub
	}
	
	public String getAdresseCli() {
		return adresseCli;
	}
	public void setAdresseCli(String adresseCli) {
		this.adresseCli = adresseCli;
	}
	public String getCodePostalCli() {
		return codePostalCli;
	}
	public void setCodePostalCli(String codePostalCli) {
		this.codePostalCli = codePostalCli;
	}
	public String getProfessionCli() {
		return professionCli;
	}
	public void setProfessionCli(String professionCli) {
		this.professionCli = professionCli;
	}
	public String getVilleCli() {
		return villeCli;
	}
	public void setVilleCli(String villeCli) {
		this.villeCli = villeCli;
	}
	
	
}
