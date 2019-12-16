package com.fstg.ConservationProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.CommissionItem;
import com.fstg.ConservationProject.dao.CommissionItemDao;
import com.fstg.ConservationProject.service.CommissionItemService;
import com.fstg.ConservationProject.service.CommissionService;
import com.fstg.ConservationProject.service.DossierService;
import com.fstg.ConservationProject.service.MembreCommissionService;

@Service
public class CommissionItemServiceImpl implements CommissionItemService {

	@Autowired 
	public CommissionItemDao commissionItemDao;
	@Autowired
	public MembreCommissionService membreCommissionService;
	@Autowired
    public CommissionService commissionService;
	@Autowired
    public DossierService dossierService;
	
	@Override
	public void save(CommissionItem commissionItem) {
		membreCommissionService.save(commissionItem.getMembreCommission());
		commissionService.save(commissionItem.getCommission());
		dossierService.save(commissionItem.getDossier());

		commissionItemDao.save(commissionItem);
	}

	@Override
	public List<CommissionItem> findAll() {
		return  commissionItemDao.findAll();
	}

	

	


}
