package com.fstg.ConservationProject.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.CommissionItem;
import com.fstg.ConservationProject.bean.MembreCommission;
import com.fstg.ConservationProject.dao.MembreCommissionDao;
import com.fstg.ConservationProject.service.CommissionItemService;
import com.fstg.ConservationProject.service.MembreCommissionService;

@Service
public class MembreCommissionServiceImpl implements MembreCommissionService {

	@Autowired
	public MembreCommissionDao membreCommissionDao;
	@Autowired
	public CommissionItemService commissionItemService;
	@Override
	public void save(MembreCommission membreCommission) {
		membreCommissionDao.save(membreCommission);
	}

	@Override
	public List<MembreCommission> findAll() {
		return  membreCommissionDao.findAll();
	}

	@Override
	public MembreCommission findByNum(String num) {
		return membreCommissionDao.findByNum(num);
	}
	@Override
	public List<MembreCommission> commissionTeam(String numCommission) {
		
		List<CommissionItem> commissionItems =  commissionItemService.findAll();
		List<MembreCommission> commissionTeam = new ArrayList<MembreCommission>();
		int i=0, E=0;
		for(i=0;i<commissionItems.size();i++) {
			if (commissionItems.get(i).getCommission().getNumCommission().equalsIgnoreCase(numCommission)){
				commissionTeam.add(commissionItems.get(i).getMembreCommission());
				E=1;
			}
		}
		if( E==0) return null;
		else return commissionTeam;
	}
}
