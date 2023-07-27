package org.verizon.VerizonSP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonSP.model.CatalogModel;

@Repository

public interface CatalogRepo extends JpaRepository<CatalogModel, Integer>{ 

}
