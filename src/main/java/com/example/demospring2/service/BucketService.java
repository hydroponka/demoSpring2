package com.example.demospring2.service;

import com.example.demospring2.model.Bucket;
import com.example.demospring2.model.Product;
import com.example.demospring2.model.User;

public interface BucketService {
    Bucket createBucket(User user);
    void addProductToBucket(Bucket bucket, Product product);
    Bucket findBucketByUser(String lastName);
}
