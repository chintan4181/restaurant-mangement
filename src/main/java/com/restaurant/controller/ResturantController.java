package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Table;
import com.restaurant.service.ResturantService;

@RestController
@RequestMapping(produces = {"application/json"})
public class ResturantController {

	@Autowired
	ResturantService restaurantService;
	
	@PostMapping("/tables")
    public void bookTables(@RequestBody Table table){
		restaurantService.bookTable(table);
    }
	
	@GetMapping("/tables")
	public ResponseEntity<List<Table>> getAllTables(){
		return restaurantService.getAllTables();
	}
	
	@GetMapping("/tables/{id}")
	public ResponseEntity<Table> getTable(@RequestParam int id){
		return restaurantService.getTable(id);
	}
	
}
