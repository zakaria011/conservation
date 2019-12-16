package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Dossier;


@Repository
public interface DossierDao extends JpaRepository<Dossier, Long> {

	Dossier findByReference(String reference);  
}

