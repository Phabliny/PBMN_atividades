package com.example.purchaseOrder.controllers;

import com.example.purchaseOrder.entities.Order;
import com.example.purchaseOrder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService servOrder;

    @GetMapping("/{id}")
    public Optional<Order> findById (@PathVariable String id) {
        return servOrder.findById(id);
    }

    @GetMapping
    public List<Order> findAll () {
        return servOrder.findAll();
    }

    @PostMapping
    public Order create (@RequestBody Order order) {
        return servOrder.create(order);
    }

    @PutMapping
    public Order update (@RequestBody Order order) {
        return servOrder.update(order);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable String id){
        servOrder.delete(id);
    }

    @DeleteMapping
    public void delete (@RequestBody Order order) {
        servOrder.delete(order);
    }
}
