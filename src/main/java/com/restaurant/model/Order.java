/**
 * 
 */
package com.restaurant.model;

import java.util.List;

/**
 * @author chintanparekh
 *
 */
public class Order {

	private long id;
	private String billNo;
	private List<MenuItem> menuItems;

	private int quantity;
	private String orderTime;

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Order(long id, String billNo, int quantity, String orderTime) {
		super();
		this.id = id;
		this.billNo = billNo;
		
		this.quantity = quantity;
		this.orderTime = orderTime;
	}

}
