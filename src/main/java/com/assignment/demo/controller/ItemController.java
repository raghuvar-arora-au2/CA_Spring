package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.models.Item;
import com.assignment.demo.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


class QuantityDto{
    public int quantity;
}

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;


    @GetMapping()
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
    

    @GetMapping("/{id}")
    public Item getItemById(@RequestParam Long id) {
        return itemService.getItemById(id).get();
    }
    

    @PutMapping("{id}")
    public Item addQuantityToItem(@PathVariable Long id, @RequestBody QuantityDto entity) {
        itemService.addQuantityToItem(id, entity.quantity);
        return itemService.getItemById(id).get();
    }

    @PostMapping()
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }
    
    

}
