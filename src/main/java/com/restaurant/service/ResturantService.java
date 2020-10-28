package com.restaurant.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restaurant.model.Table;

@Service
public class ResturantService {

	public void bookTable(Table table) {
		//check if table is occupied or not
		//book
		return ;
	}

	public ResponseEntity<List<Table>> getAllTables() {
		
		return null;
	}

	public ResponseEntity<Table> getTable(int id) {
		
		return null;
	}

}
