package com.fstg.ConservationProject.service;

import java.util.Date;
import java.util.List;

import com.fstg.ConservationProject.bean.TauxTaxe;

public interface TauxTaxeService  {
  double taxes(Date date) ;
  public void save(TauxTaxe tauxTaxe);
	public List< TauxTaxe> findAll();
	
}
