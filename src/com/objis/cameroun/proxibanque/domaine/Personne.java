package com.objis.cameroun.proxibanque.domaine;

public class Personne {

	private String idPers;
	private String nomPers;
	private String prenomPers;
	private String telephonePers;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Personne(String idPers, String nomPers, String prenomPers,
			String telephonePers) {
		super();
		this.idPers = idPers;
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.telephonePers = telephonePers;
	}

		
		
	public Personne(String nomPers, String prenomPers, String telephonePers) {
			super();
			this.nomPers = nomPers;
			this.prenomPers = prenomPers;
			this.telephonePers = telephonePers;
		}

	public String getIdPers() {
		return idPers;
	}

	public void setIdPers(String idPers) {
		this.idPers = idPers;
	}

	public String getNomPers() {
		return nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public String getPrenomPers() {
		return prenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}

	public String getTelephonePers() {
		return telephonePers;
	}

	public void setTelephonePers(String telephonePers) {
		this.telephonePers = telephonePers;
	}

	public String toString() {
		return "Personne [idPers=" + idPers + ", nomPers=" + nomPers
				+ ", prenomPers=" + prenomPers + ", telephonePers="
				+ telephonePers + "]";
	}
	
	
	
}
