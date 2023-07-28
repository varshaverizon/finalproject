package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.VerizonSP.model.CustomerModel;
import com.verizon.VerizonSP.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController 
{
	private CustomerService customerservice;

	@Autowired
	public CustomerController(CustomerService customerservice) {
		this.customerservice = customerservice;
	}

	@RequestMapping("/allcustomer")
	public List<CustomerModel> getAllCustomerModel() {
		return customerservice.getAllCustomerModel();

	}

	@PostMapping("/insert")
	public CustomerModel createcustomermodel(@RequestBody CustomerModel customermod) {
		return customerservice.createcustomermodel(customermod);
	}
}

