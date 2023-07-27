package org.verizon.VerizonSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EnCustModel {
	@Id
	private int ec_id;
	private String ec_name;
	private String order_name;
	private int order_id;
	
	public int getEc_id() {
		return ec_id;
	}
	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}
	public String getEc_name() {
		return ec_name;
	}
	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

}
