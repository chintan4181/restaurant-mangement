package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Order;
import com.restaurant.service.OrderService;

@RestController
@RequestMapping(produces = {"application/json"})
public class OrderController {

	@Autowired
    OrderService orderService;

    @PostMapping("/orders")
    public void addOrder(@RequestBody Order order){
         orderService.addOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void removeOrder(@RequestParam int id){
        orderService.removeOrder(id);
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<Order> getOrder(@RequestParam long orderId){
        return orderService.getOrder(orderId);
    }
   
}
