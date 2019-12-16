package com.fstg.ConservationProject.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dossier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	@ManyToOne
	private Client client;
	@OneToOne
	private Objet objet;
	private Date dateArrive;
	private double montantPaye;
	private Date datePaiement;
	private String avis;

	public Dossier(Long id, String reference, Date dateArrive, String clientCni, Objet objet, double montantPaye,
			Date datePaiement, String avis, String matriculeObjet) {
		super();
		this.id = id;
		this.reference = reference;
		this.dateArrive = dateArrive;
		this.montantPaye = montantPaye;
		this.datePaiement = datePaiement;
		this.avis = avis;
	}

	public Dossier() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}

	public void setMontantPaye(double montantPaye) {
		this.montantPaye = montantPaye;
	}

	public double getMontantPaye() {
		return montantPaye;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Objet getObjet() {
		return objet;
	}

	public void setObjet(Objet objet) {
		this.objet = objet;
	}

}
