package org.verizon.VerizonSP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonSP.model.CatalogModel;
import org.verizon.VerizonSP.service.CatalogService;


@RestController
@RequestMapping("/api/catalogmodel")
public class CatalogController 
{
	private CatalogService catalogservice;
	 
	@Autowired
	public CatalogController(CatalogService catalogservice)
	{
		this.catalogservice = catalogservice;
	}
	
	@RequestMapping("/allcust")
	public List<CatalogModel> getAllCatalogModel(){
		return catalogservice.getAllCatalogModel();
		
	}
	@PostMapping("/insert")
	public CatalogModel createcatalogmodel(@RequestBody CatalogModel catmod)
	{
		return catalogservice.createcatalogmodel(catmod);
}
 
}
