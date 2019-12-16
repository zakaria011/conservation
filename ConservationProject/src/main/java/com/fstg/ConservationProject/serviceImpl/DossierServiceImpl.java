package com.fstg.ConservationProject.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Dossier;
import com.fstg.ConservationProject.bean.Observation;
import com.fstg.ConservationProject.dao.DossierDao;
import com.fstg.ConservationProject.service.ClientService;
import com.fstg.ConservationProject.service.DossierService;
import com.fstg.ConservationProject.service.ObjetService;
import com.fstg.ConservationProject.service.ObservationService;
import com.fstg.ConservationProject.service.TauxTaxeService;


@Service
public  class DossierServiceImpl implements DossierService {
	@Autowired
	public DossierDao dossierDao;
    @Autowired
    public ObjetService objetService;
    @Autowired
    public TauxTaxeService tauxTaxeService;
    @Autowired
    public ObservationService observationService;
    @Autowired
    public ClientService clientService;
    
	@Override
	public void save(Dossier dossier) {
		clientService.save(dossier.getClient());
		objetService.save(dossier.getObjet());
		dossierDao.save(dossier);
	}
	
	@Override
	public Dossier findByReference(String reference) {
	   return dossierDao.findByReference(reference);
	}
	
	@Override
	public List<Dossier> findAll() {	
		return dossierDao.findAll() ;
	}
	@Override
	public void actualiserAvis(String reference, String avis) {
		Dossier dossier = new Dossier();
		dossier=dossierDao.findByReference(reference);
		dossier.setAvis(avis);
		save(dossier);
	}
	
	@Override
	public double taxes(String reference) {
		
         Dossier dossier=dossierDao.findByReference(reference);
	     Date dateArrive = dossier.getDateArrive();	
		return tauxTaxeService.taxes(dateArrive);
	}
	
	@Override
	public Dossier findDossierObservation(String refObservation) {
		Observation observation = new Observation();
		observation=observationService.findByRefObservation(refObservation);
		return dossierDao.findByReference(observation.getDossier().getReference());
	}
}
