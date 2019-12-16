package com.fstg.ConservationProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Observation;
import com.fstg.ConservationProject.dao.ObservationDao;
import com.fstg.ConservationProject.service.DossierService;
import com.fstg.ConservationProject.service.ObservationService;
import com.fstg.ConservationProject.service.UserService;
@Service
public class ObservationServiceImpl implements ObservationService {

	@Autowired
	ObservationDao observationDao;
	@Autowired
	DossierService dossierService;
	@Autowired
	UserService userService;
	
	@Override
	public Observation findByRefObservation(String refObservation) {
		return observationDao.findByRefObservation(refObservation);
	}

	@Override
	public void save(Observation observation) {
		userService.save(observation.getUser());
		dossierService.save(observation.getDossier());
		observationDao.save(observation);
	}

	@Override
	public List<Observation> findAll() {
		return observationDao.findAll();
	}

 
}

