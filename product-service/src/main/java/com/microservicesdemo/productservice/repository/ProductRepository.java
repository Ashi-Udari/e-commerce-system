package com.microservicesdemo.productservice.repository;

import com.microservicesdemo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
