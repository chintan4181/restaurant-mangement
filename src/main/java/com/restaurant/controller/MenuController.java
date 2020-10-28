package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.MenuItem;
import com.restaurant.service.MenuService;

@RestController
@RequestMapping(produces = {"application/json"})
public class MenuController {

	@Autowired
    MenuService menuService;

    @PostMapping("/menus")
    public void addMenu(@RequestBody MenuItem menu){
        menuService.addMenu(menu);
    }

    @PutMapping("/menus/{id}")
    public void updateMenu(@RequestParam int id){
        menuService.updateMenu(id);
    }

    @DeleteMapping("/menus/{id}")
    public void removeMenu(@RequestParam String name){
        menuService.removeMenu(name);
    }


    @GetMapping("/menus/{id}")
    public ResponseEntity<MenuItem> getMenu(@RequestParam int id){
        return menuService.getMenu(id);
    }
    
    @GetMapping("/menus")
    public ResponseEntity<MenuItem> geAllMenu(){
        return menuService.getAllMenu();
    }
}
