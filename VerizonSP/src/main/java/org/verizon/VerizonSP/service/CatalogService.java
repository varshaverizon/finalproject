package org.verizon.VerizonSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonSP.model.CatalogModel;
import org.verizon.VerizonSP.repo.CatalogRepo;



@Service
public class CatalogService {
	
	private final CatalogRepo catalogrepo;
	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {
		this.catalogrepo = catalogrepo;
		
	}
	  
	public List<CatalogModel> getAllCatalogModel()
	{
		return catalogrepo.findAll();
	}

	public CatalogModel createcatalogmodel(CatalogModel catmod) {
		return catalogrepo.save(catmod);
	}
}


