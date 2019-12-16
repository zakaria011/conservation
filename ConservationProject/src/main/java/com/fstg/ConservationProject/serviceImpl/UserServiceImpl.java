package com.fstg.ConservationProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Observation;
import com.fstg.ConservationProject.bean.User;
import com.fstg.ConservationProject.dao.UserDao;
import com.fstg.ConservationProject.service.ObservationService;
import com.fstg.ConservationProject.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Autowired
	ObservationService observationService;
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findByNum(String num) {
		
		return userDao.findByNum(num);
	}
	
	@Override
	public User findUserObservation(String refObservation) {
		Observation observation = new Observation();
		observation=observationService.findByRefObservation(refObservation);
		return userDao.findByNum(observation.getUser().getNum());
	}

}
