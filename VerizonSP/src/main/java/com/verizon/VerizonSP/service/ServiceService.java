package com.verizon.VerizonSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.VerizonSP.model.ServiceModel;
import com.verizon.VerizonSP.repo.ServiceRepo;

@Service
public class ServiceService 
{
	private final ServiceRepo servicerepo;

	@Autowired
	public ServiceService(ServiceRepo servicerepo) {
		this.servicerepo = servicerepo;

	}

	public List<ServiceModel> getAllServiceModel() {
		return servicerepo.findAll();
	}

	public ServiceModel createservicemodel(ServiceModel servmod) {
		return servicerepo.save(servmod);
	}

	public ServiceModel updateServiceModel(Integer service_id, ServiceModel serv)
	{
		ServiceModel existingServiceModel= servicerepo.findById(service_id).orElse(null);
		if(existingServiceModel !=null)
		{
			existingServiceModel.setServicemodel(serv.getServicemodel());
			existingServiceModel.setProvision(serv.getProvision());
			return servicerepo.save(existingServiceModel);
		}
		return null;
}
}