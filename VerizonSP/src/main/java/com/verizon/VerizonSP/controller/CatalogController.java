package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.verizon.VerizonSP.model.CatalogModel;
import com.verizon.VerizonSP.repo.CatalogRepo;

@Controller
@RequestMapping("/catalog/")
public class CatalogController {
	private CatalogRepo catarepo;

	@Autowired
	public CatalogController(CatalogRepo catarepo) {
		this.catarepo = catarepo;
	}

	/*
	 * @RequestMapping("/allcatalog") public List<CatalogModel> getAllCatalogModel()
	 * { return catalogservice.getAllCatalogModel();
	 * 
	 * }
	 */
	@GetMapping("create")
	public String createcatalogmodel(CatalogModel catamod) {
		return "catalog";
	}
	@PostMapping("submit-plan")
	public String save(CatalogModel catamod)
	{this.catarepo.save(catamod);
	return "home.html";
		}
		/*
		 * @DeleteMapping("/{plan_id}") public void deleterCatalogModel(@PathVariable
		 * int plan_id) { catalogservice.deleteCatalogModel(plan_id); }
		 */
}