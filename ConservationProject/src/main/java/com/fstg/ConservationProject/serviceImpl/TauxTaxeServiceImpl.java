package com.fstg.ConservationProject.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.TauxTaxe;
import com.fstg.ConservationProject.dao.TauxTaxeDao;
import com.fstg.ConservationProject.service.TauxTaxeService;
@Service
public class TauxTaxeServiceImpl implements  TauxTaxeService {

	@Autowired
	public TauxTaxeDao tauxTaxeDao;
	

	@Override
	public List<TauxTaxe> findAll() {
		return  tauxTaxeDao.findAll();
	}

	@Override
	public double taxes(Date date) {
		double taxe = 0;
		int i=0;
	    List<TauxTaxe> tauxTaxes  =  tauxTaxeDao.findAll();
		for (i=0;i<tauxTaxes.size();i++) {
			if ( date.compareTo(tauxTaxes.get(i).getDateDepartApplication())>=0 &&
					date.compareTo(tauxTaxes.get(i).getDateFintApplication())<0  ) {
				taxe = tauxTaxes.get(i).getMontant();
			}
		}
		
		return taxe;
	}

	@Override
	public void save(TauxTaxe tauxTaxe) {
		tauxTaxeDao.save(tauxTaxe);
	}

	

	
}

