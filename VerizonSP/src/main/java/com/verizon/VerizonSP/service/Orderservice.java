package com.verizon.VerizonSP.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.VerizonSP.model.OrderModel;
import com.verizon.VerizonSP.repo.OrderRepo;

@Service
public class Orderservice 
{
	private final  OrderRepo orderRepo;
	@Autowired
	public Orderservice(OrderRepo orderRepo) 
	{
		this.orderRepo = orderRepo;
		
	}
	  
	public List<OrderModel> getAllOrderModel()
	{
		return orderRepo.findAll();
	}

	public OrderModel createordermodel(OrderModel OrderModel) {
		return orderRepo.save(OrderModel);
	}
	public OrderModel updateOrderModel(Integer plan_id, OrderModel od)
	{
		OrderModel existingOrderModel= orderRepo.findById(plan_id).orElse(null);
		if(existingOrderModel !=null)
		{
			existingOrderModel.setPlan(od.getPlan());
			existingOrderModel.setPlanid(od.getPlanid());
			return orderRepo.save(existingOrderModel);
		}
		return null;
	
	
	}
}