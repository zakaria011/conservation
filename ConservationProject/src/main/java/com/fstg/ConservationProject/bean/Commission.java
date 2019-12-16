package com.fstg.ConservationProject.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commission {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String numCommission;
	@ManyToOne
	private Dossier dossier;
	private Date dateDepartCommission;
	private Date dateFinCommission;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDepartCommission() {
		return dateDepartCommission;
	}
	public void setDateDepartCommission(Date dateDepartCommission) {
		this.dateDepartCommission = dateDepartCommission;
	}
	public Date getDateFinCommission() {
		return dateFinCommission;
	}
	public void setDateFinCommission(Date dateFinCommission) {
		this.dateFinCommission = dateFinCommission;
	}
	public Commission(Long id, Date dateDepartCommission, Date dateFinCommission,String numCommission) {
		super();
		this.id = id;
		this.dateDepartCommission = dateDepartCommission;
		this.dateFinCommission = dateFinCommission;
		this.numCommission=numCommission;
	}
	public Commission() {
		super();
	}
	public String getNumCommission() {
		return numCommission;
	}
	public void setNumCommission(String numCommission) {
		this.numCommission = numCommission;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	
	
	
    
}

