package com.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.VerizonSP.model.CustomerModel;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerModel,Integer> 
{
	
}
