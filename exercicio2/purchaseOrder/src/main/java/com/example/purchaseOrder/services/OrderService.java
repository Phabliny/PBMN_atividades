package com.example.purchaseOrder.services;

import com.example.purchaseOrder.entities.Order;
import com.example.purchaseOrder.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repoOrder;

    @Autowired
    private Message message;

    public List<Order> findAll() {
        return repoOrder.findAll();
    }

    public Optional<Order> findById(String id) {
        return repoOrder.findById(id);
    }

    public Order create (Order order) {
        var newOrder = repoOrder.save(order);
        message.sendMessage(newOrder);
        return newOrder;
    }

    public Order update (Order order) {
        if(order != null && !order.getId().isEmpty()){
            if(findById(order.getId()) != null)
                repoOrder.save(order);
            Optional<Order> currentOrder = repoOrder.findById(order.getId());
            message.sendMessage(currentOrder.get());
        }
        throw new RuntimeException();
    }

    public void delete (String id) {
        Optional<Order> currentOrder = repoOrder.findById(id);
        repoOrder.deleteById(id);
        messageOrder.sendMessage(currentOrder.get());
    }

    public void delete (Order order) {
        repoOrder.delete(order);
    }
}
