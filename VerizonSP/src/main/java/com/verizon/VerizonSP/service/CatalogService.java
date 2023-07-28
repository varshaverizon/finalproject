package com.verizon.VerizonSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.VerizonSP.model.CatalogModel;
import com.verizon.VerizonSP.repo.CatalogRepo;

@Service
public class CatalogService {

	private final CatalogRepo catalogrepo;

	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {
		this.catalogrepo = catalogrepo;

	}

	public List<CatalogModel> getAllCatalogModel() {
		return catalogrepo.findAll();
	}

	public CatalogModel createcatalogmodel(CatalogModel catmod) {
		return catalogrepo.save(catmod);
	}
	public CatalogModel updateCatalogModel(Integer id, CatalogModel cata) {
		CatalogModel existingCatalogModel=catalogrepo.findById(id).orElse(null);
	if (existingCatalogModel !=null)
	{
		existingCatalogModel.setPlan(cata.getPlan());
		existingCatalogModel.setDuration(cata.getDuration());
		existingCatalogModel.setPrice(cata.getPrice());
		existingCatalogModel.setDescription(cata.getDescription());
		return catalogrepo.save(existingCatalogModel);
	}
	
	return null;
	}
	public void deleteCatalogModel(Integer plan_id)
	{
		catalogrepo.deleteById(plan_id);
	}
}