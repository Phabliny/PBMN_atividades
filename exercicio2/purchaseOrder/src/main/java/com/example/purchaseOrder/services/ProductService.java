package com.example.purchaseOrder.services;

import com.example.purchaseOrder.entities.Product;
import com.example.purchaseOrder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repoProd;

    public List<Product> findAll() {
        return repoProd.findAll();
    }

    public Optional<Product> findById(String id) {
        return repoProd.findById(id);
    }

    public Product create (Product product) {
        var newProduct = repoProd.save(product);
        return newProduct;
    }

    public Product update (Product product) {
        if(product != null && !product.getId().isEmpty()){
            if(findById(product.getId()) != null)
                repoProd.save(product);
        }
        return null;
    }

    public void delete (String id) {
        repoProd.deleteById(id);
    }

    public void delete (Product product) {
        repoProd.delete(product);
    }
}
