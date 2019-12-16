package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.User;
@Repository
public interface UserDao extends JpaRepository< User, Long> {
 
	User findByNum(String num);
}
