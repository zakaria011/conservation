package com.fstg.ConservationProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Dossier;
import com.fstg.ConservationProject.bean.Objet;
import com.fstg.ConservationProject.dao.ObjetDao;
import com.fstg.ConservationProject.service.DossierService;
import com.fstg.ConservationProject.service.ObjetService;
@Service
public class ObjetServiceImpl implements ObjetService {

	@Autowired
	public ObjetDao objetDao;
	@Autowired
	DossierService dossierService;
	@Override
	public void save(Objet objet) {
		
		objetDao.save(objet);
	}

	@Override
	public List<Objet> findAll() {
		return  objetDao.findAll();
	}

	@Override
	public Objet findByMatricule(String matricule) {
		
		return (Objet) objetDao.findByMatricule(matricule);
	}
	@Override
	public Objet objetByDossier(String reference) {
		Dossier dossier =dossierService.findByReference(reference);
		Objet objet = (Objet) dossier.getObjet();
		return objet;
	}

}

