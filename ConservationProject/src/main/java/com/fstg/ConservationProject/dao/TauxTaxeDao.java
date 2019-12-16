package com.fstg.ConservationProject.dao;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.TauxTaxe;
@Repository
public interface TauxTaxeDao extends JpaRepository< TauxTaxe, Long> {
   
	TauxTaxe findByDateDepartApplication( Date dateDepartApplication);
	TauxTaxe findByDateFintApplication( Date dateFinApplication);
}
