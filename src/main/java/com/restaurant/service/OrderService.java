package com.restaurant.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restaurant.model.Order;

@Service
public class OrderService {

	//OrderRepository - connects to db for crud operations.
	
	public void addOrder(Order order) {
		
		return ;
	}

	public void removeOrder(int id) {
		
		
	}

	public ResponseEntity<Order> checkOut(long orderId) {
		
		return null;
	}
	
	
	public ResponseEntity<Order> getOrder(long orderId) {
		
		return null;
	}

	
}
