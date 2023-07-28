package com.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.VerizonSP.model.ServiceModel;

@Repository
public interface ServiceRepo extends JpaRepository<ServiceModel,Integer>{

}
