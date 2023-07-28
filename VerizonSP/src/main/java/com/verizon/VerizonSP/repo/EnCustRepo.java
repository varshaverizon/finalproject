package com.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.verizon.VerizonSP.model.EnCustModel;

@Repository

public interface EnCustRepo extends JpaRepository<EnCustModel, Integer> {

}

