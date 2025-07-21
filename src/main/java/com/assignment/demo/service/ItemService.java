package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.models.Item;
import com.assignment.demo.repository.ItemRepository;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public void addQuantityToItem(Long id, int quantity){
        itemRepository.addQuantityToItem(id,quantity);
    }

    public Item addItem(Item item){
        return itemRepository.save(item);
    }
    
}
