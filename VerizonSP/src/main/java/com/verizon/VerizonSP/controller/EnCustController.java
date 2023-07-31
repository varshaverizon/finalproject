package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.verizon.VerizonSP.model.EnCustModel;
import com.verizon.VerizonSP.repo.EnCustRepo;

@Controller
@RequestMapping("/encustmodel")
public class EnCustController

{
	private EnCustRepo ecrepo ;

	@Autowired
	public EnCustController(EnCustRepo ecrepo) {
		this.ecrepo=ecrepo;
	}

	/*
	 * @RequestMapping("/allcust") public List<EnCustModel> getAllEnCustModel() {
	 * return encustservice.getAllEnCustModel();
	 * 
	 * }
	 */
	@GetMapping("/createECCustomer")
	public String create(EnCustModel encustmod)
	{
		return "index";
	}
	@PostMapping("/{plan_id}")
	public String save(EnCustModel encustmod)
	{
		this.ecrepo.save(encustmod);
		return "ECCustomer.html";
	}

}