package com.fstg.ConservationProject.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Commission;
import com.fstg.ConservationProject.dao.CommissionDao;
import com.fstg.ConservationProject.service.CommissionService;
import com.fstg.ConservationProject.service.DossierService;
@Service
public class CommissionServiceImpl implements CommissionService {
 
	@Autowired
	CommissionDao commissionDao;
	@Autowired
	public DossierService dossierService;
	
	@Override
	public Commission findByNum(String num) {
		return commissionDao.findByNumCommission(num);
	}

	@Override
	public void save(Commission commission) {
		dossierService.save(commission.getDossier());
		commissionDao.save(commission);
	}

	@Override
	public List<Commission> findAll() {
		
		return commissionDao.findAll();
	}

	@Override
	public List<Commission> commissionDeDossier(String refDossier) {
		 List<Commission> commissions  = commissionDao.findAll();
		 List<Commission> commissionsDossier = new ArrayList<Commission>();
		 int i=0,E=0;
		 for(i=0;i<commissions.size();i++)
		 {
			 if(commissions.get(i).getDossier().getReference().equalsIgnoreCase(refDossier)) {
				 commissionsDossier.add(commissions.get(i));
				 E=2;
			 }
		 }
		if(E== 0) return null;
		else return commissionsDossier;
	}

}
