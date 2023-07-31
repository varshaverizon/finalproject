package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.verizon.VerizonSP.model.CustomerModel;
import com.verizon.VerizonSP.repo.CustomerRepo;

@Controller
@RequestMapping("/consumer/customers")
public class CustomerController 
{
	private CustomerRepo custrepo;

	@Autowired
	public CustomerController(CustomerRepo custrepo) {
		this.custrepo=custrepo;
	}

	/*
	 * @RequestMapping("/allcustomer") public List<CustomerModel>
	 * getAllCustomerModel() { return customerservice.getAllCustomerModel();
	 * 
	 * }
	 */
	@GetMapping("/create/customer")
	public String create (CustomerModel custmod) {
		return "index";
	}
	@PostMapping("/{plan_id}")
	public String save(CustomerModel custmod)
	{	this.custrepo.save(custmod);
		return "customer.html";
	}
}

