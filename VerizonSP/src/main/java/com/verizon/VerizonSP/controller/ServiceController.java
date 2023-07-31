package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.verizon.VerizonSP.model.ServiceModel;
import com.verizon.VerizonSP.repo.ServiceRepo;

@Controller
@RequestMapping("/service")
public class ServiceController 
{
	private ServiceRepo servrepo;

	@Autowired
	public ServiceController(ServiceRepo servrepo) {
		this.servrepo=servrepo;
	}

	/*
	 * @RequestMapping("/allservice") public List<ServiceModel> getAllServiceModel()
	 * { return serviceservice.getAllServiceModel();
	 * 
	 * }
	 */
	@GetMapping("/create")
	public String create(ServiceRepo servrepo) {
		return "index";
	}
	@PostMapping("/{service_id}")
	public String save(ServiceModel servmod)
	{
		this.servrepo.save(servmod);
		return "Service.html";
	}
}
