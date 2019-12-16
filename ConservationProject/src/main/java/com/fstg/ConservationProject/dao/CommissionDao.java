package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Commission;
@Repository
public interface CommissionDao extends JpaRepository<Commission , Long> {
 
	Commission findByNumCommission(String num);
}

