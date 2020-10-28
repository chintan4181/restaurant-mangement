package com.restaurant.model;

public class Customer {

	private int custId;
	private String name;
	private Order order;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Customer(int custId, String name, Order order) {
		super();
		this.custId = custId;
		this.name = name;
		this.order = order;
	}
	
	
}
