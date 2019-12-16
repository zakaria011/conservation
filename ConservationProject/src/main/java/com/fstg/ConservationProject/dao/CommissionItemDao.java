package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fstg.ConservationProject.bean.CommissionItem;
@Repository
public interface CommissionItemDao  extends JpaRepository<CommissionItem , Long> {

}
