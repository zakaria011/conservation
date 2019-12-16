package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.Dossier;

public interface DossierService {

	public void save( Dossier  dossier);
	public List<Dossier> findAll();
	public void actualiserAvis(String reference, String avis);
	public double taxes(String reference);
	public  Dossier findByReference(String reference);  
	public Dossier findDossierObservation(String refObservation);
}
