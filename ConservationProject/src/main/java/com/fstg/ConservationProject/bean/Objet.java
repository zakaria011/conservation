package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Objet {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private Client client;
	private String matricule;
	 @ManyToOne                                 
	private Projet projet;
	private String adresse;
	private String superficie;
	private String statusFiscal;
	private String prefecture;
	private String commune;
	private String province;
	
	
	
	public Objet(long id,String cNIProprietaire,String matricule, String adresse, String statusFiscal, String prefecture, String commune,
			String province ,String referenceProjet) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.statusFiscal = statusFiscal;
		this.prefecture = prefecture;
		this.commune = commune;
		this.province = province;
	}
	public String getStatusFiscal() {
		return statusFiscal;
	}
	public void setStatusFiscal(String statusFiscal) {
		this.statusFiscal = statusFiscal;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Objet() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}	
	
	
}
