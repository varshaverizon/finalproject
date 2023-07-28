package com.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.VerizonSP.model.OrderModel;

@Repository
public interface OrderRepo extends JpaRepository<OrderModel,Integer>{

}



