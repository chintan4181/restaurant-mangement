/**
 * 
 */
package com.restaurant.model;

/**
 * @author chintanparekh
 *
 */
public class MenuItem {

	private String name;
    private String description;
    private int price;
	private int id;
	
    
   
    
	public MenuItem(String name, String description, int price, int id) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
