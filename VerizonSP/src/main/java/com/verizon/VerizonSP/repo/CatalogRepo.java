package com.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.verizon.VerizonSP.model.CatalogModel;

@Repository

public interface CatalogRepo extends JpaRepository<CatalogModel, Integer> 
{

}
