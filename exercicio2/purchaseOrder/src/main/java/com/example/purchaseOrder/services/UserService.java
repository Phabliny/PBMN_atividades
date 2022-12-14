package com.example.purchaseOrder.services;

import com.example.purchaseOrder.entities.User;
import com.example.purchaseOrder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repoUser;

    public List<User> findAll() {
        return repoUser.findAll();
    }

    public Optional<User> findById(String id) {
        return repoUser.findById(id);
    }

    public User create (User user) {
        var newOrder = repoUser.save(user);
//        messageProduct.sendMessage(newProduct);
        return newOrder;
    }

    public User update (User user) {
        if(user != null && !user.getId().isEmpty()){
            if(findById(user.getId()) != null)
                repoUser.save(user);
        }
        return null;
    }

    public void delete (String id) {
        repoUser.deleteById(id);
    }

    public void delete (User user) {
        repoUser.delete(user);
    }
}