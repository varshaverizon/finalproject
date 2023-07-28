package com.verizon.VerizonSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.VerizonSP.model.EnCustModel;
import com.verizon.VerizonSP.repo.EnCustRepo;

@Service
public class EnCustService {

	private final EnCustRepo EnCustrepo;

	@Autowired
	public EnCustService(EnCustRepo enCustrepo) {
		this.EnCustrepo = enCustrepo;
	}

	public List<EnCustModel> getAllEnCustModel() {
		return EnCustrepo.findAll();
	}

	public EnCustModel createencustmodel(EnCustModel encustmod) {
		return EnCustrepo.save(encustmod);
	}
}
