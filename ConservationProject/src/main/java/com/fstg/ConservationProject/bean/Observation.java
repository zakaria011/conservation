package com.fstg.ConservationProject.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author
 */
@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String refObservation;
	private Date dateObservation;
	private String message;
	@ManyToOne
	private Dossier dossier;
	@ManyToOne
	private User user;

	public Observation() {
		super();
	}

	public Observation(String refObservation, Date dateObservation, Objet objet, String message, String numUser,
			String dossierId) {
		super();
		this.dateObservation = dateObservation;
		this.message = message;
		this.refObservation = refObservation;
	}

	public Date getDateObservation() {
		return dateObservation;
	}

	public void setDateObservation(Date dateObservation) {
		this.dateObservation = dateObservation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRefObservation() {
		return refObservation;
	}

	public void setRefObservation(String refObservation) {
		this.refObservation = refObservation;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}