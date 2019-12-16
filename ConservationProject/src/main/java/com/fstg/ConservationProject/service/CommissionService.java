package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.Commission;

public interface CommissionService  {
	public Commission findByNum(String num);
    public void save(Commission commission);
    public List<Commission> findAll();
    public List<Commission> commissionDeDossier(String refDossier);
}

