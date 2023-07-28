package com.verizon.VerizonSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.VerizonSP.model.CustomerModel;
import com.verizon.VerizonSP.repo.CustomerRepo;

@Service
public class CustomerService {

	private final CustomerRepo customerrepo;

	@Autowired
	public CustomerService(CustomerRepo customerrepo) {
		this.customerrepo = customerrepo;

	}

	public List<CustomerModel> getAllCustomerModel() {
		return customerrepo.findAll();
	}

	public CustomerModel createcustomermodel(CustomerModel customermod) {
		return customerrepo.save(customermod);
	}
}
