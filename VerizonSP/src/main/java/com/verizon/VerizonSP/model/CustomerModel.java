package com.verizon.VerizonSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerModel 
{
	@Id
	private int cust_id;
	@ManyToOne
	@JoinColumn(name="order_id")
	private CustomerModel customermodel;
	private String cust_name;
	private String order_name;
	
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	
	

}
