package com.verizon.VerizonSP.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
@Entity

public class OrderModel 
{

			@Id
			@ManyToOne
			@JoinTable(name="plan_id")
			private CatalogModel catalogmodel;
			
			private String Order_name;
			private int Order_id;
			
			public OrderModel() {
				super();
			}
			
			
			public CatalogModel getCatalogmodel() {
				return catalogmodel;
			}


			public void setCatalogmodel(CatalogModel catalogmodel) {
				this.catalogmodel = catalogmodel;
			}


			public String getPlan() {
				return Order_name;
			}
			public void setPlan(String Order_name) {
				this.Order_name = Order_name;
			}
			public int getPrice() {
				return Order_id;
			}
			public void setPrice(int Order_id) {
				this.Order_id = Order_id;
			}
			
			
	}
