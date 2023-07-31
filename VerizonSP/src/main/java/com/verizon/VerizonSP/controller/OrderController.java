package com.verizon.VerizonSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.VerizonSP.model.OrderModel;
import com.verizon.VerizonSP.repo.OrderRepo;
import com.verizon.VerizonSP.service.Orderservice;

@Controller
@RequestMapping("/ordermodel")
public class OrderController 
{
		
		private OrderRepo odrepo;
	 
		@Autowired
		public OrderController(OrderRepo odrepo) 
		{
			
			this.odrepo=odrepo;
		}

		/*
		 * @RequestMapping("/allorder") public List<OrderModel> getAllOrderModel() {
		 * return orderservice.getAllOrderModel();
		 * 
		 * }
		 */ 
		  @GetMapping("/create") 
		  public String create(OrderRepo odrepo) 
		  { return "index"; 
		  }
		  @PostMapping("/{plan_id}")
			public String save(OrderModel odmod)
			{ 
			  	this.odrepo.save(odmod);
				return "Order.html";
			}
		 	
	}
		
		