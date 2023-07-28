package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.VerizonSP.model.CatalogModel;
import com.verizon.VerizonSP.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
	private CatalogService catalogservice;

	@Autowired
	public CatalogController(CatalogService catalogservice) {
		this.catalogservice = catalogservice;
	}

	@RequestMapping("/allcatalog")
	public List<CatalogModel> getAllCatalogModel() {
		return catalogservice.getAllCatalogModel();

	}

	@PostMapping("/insert")
	public CatalogModel createcatalogmodel(@RequestBody CatalogModel catmod) {
		return catalogservice.createcatalogmodel(catmod);
	}
	@PostMapping("/{plan_id}")
	public CatalogModel updateCatalogModel(@RequestBody Integer plan_id,CatalogModel cata)
	{
		return catalogservice.updateCatalogModel(plan_id, cata);
		
	}
	@DeleteMapping("/{plan_id}")
	public void deleteCatalogModel(@PathVariable int plan_id)
	{
		catalogservice.deleteCatalogModel(plan_id);
	}
}