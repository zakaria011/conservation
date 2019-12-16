package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Observation;

@Repository
public interface ObservationDao extends JpaRepository< Observation, Long> {
 Observation findByRefObservation(String refObservation);
}
