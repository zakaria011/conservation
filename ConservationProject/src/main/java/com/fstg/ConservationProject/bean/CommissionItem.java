package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CommissionItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Commission commission;
	@OneToOne
	private MembreCommission membreCommission;
	@OneToOne
	private Dossier dossier;

	public CommissionItem() {
		super();
	}

	public CommissionItem(Commission commission, MembreCommission membreCommission, Dossier dossier) {
		super();
		this.commission = commission;
		this.membreCommission = membreCommission;
		this.dossier = dossier;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	public MembreCommission getMembreCommission() {
		return membreCommission;
	}

	public void setMembreCommission(MembreCommission membreCommission) {
		this.membreCommission = membreCommission;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
