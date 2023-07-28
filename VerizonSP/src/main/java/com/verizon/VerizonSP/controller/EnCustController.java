package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.VerizonSP.model.EnCustModel;
import com.verizon.VerizonSP.service.EnCustService;

@RestController
@RequestMapping("/api/encustmodel")
public class EnCustController

{
	private EnCustService encustservice;

	@Autowired
	public EnCustController(EnCustService encustservice) {
		this.encustservice = encustservice;
	}

	@RequestMapping("/allcust")
	public List<EnCustModel> getAllEnCustModel() {
		return encustservice.getAllEnCustModel();

	}

	@PostMapping("/insert")
	public EnCustModel createencustmodel(@RequestBody EnCustModel encustmod) {
		return encustservice.createencustmodel(encustmod);
	}
	
	
}