package com.restaurant.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restaurant.model.MenuItem;

@Service
public class MenuService {

	//MenuRepository - connects to db for crud operations.
	
	public void addMenu(MenuItem menu) {}

	public void updateMenu(int id) {}

	public void removeMenu(String name) {}

	public ResponseEntity<MenuItem> getMenu(int id) {
		return null;
	}

	public ResponseEntity<MenuItem> getAllMenu() {
		return null;
	}
}
