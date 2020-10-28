package com.restaurant.model;

public class Table {

	private int id;
	private boolean isReserved;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	
	public Table(int id, boolean isReserved) {
		super();
		this.id = id;
		this.isReserved = isReserved;
	}
	
	
}
