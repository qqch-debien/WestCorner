package com.example.westcornerback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.westcornerback.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    public List<Order> findAll();
    public void deleteAll();
}
