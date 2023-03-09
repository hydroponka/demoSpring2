package com.example.demospring2.service;

import com.example.demospring2.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void addToUserBucket(Long productId, Long userId);
    void addProduct(Product product);
    Product findById(Long id);
    void deleteProduct(Long id);
}
