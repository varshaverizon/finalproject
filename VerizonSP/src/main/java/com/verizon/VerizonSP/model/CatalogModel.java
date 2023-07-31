package com.verizon.VerizonSP.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class CatalogModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int plan_id;
	@ManyToOne
	@JoinColumn(name="order_id")
	private CatalogModel catalogmodel;
	private String plan;
	private int price;
	private String duration;
	
	public CatalogModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}