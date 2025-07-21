package com.assignment.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.demo.models.Item;

import jakarta.transaction.Transactional;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByName(String name);

    List<Item> findAll();

    Optional<Item> findById(Long id);


    @Modifying
    @Transactional
    @Query("UPDATE Item i SET i.quantity = i.quantity + :quantity WHERE i.id = :id")
    void addQuantityToItem(Long id, int quantity);

}
