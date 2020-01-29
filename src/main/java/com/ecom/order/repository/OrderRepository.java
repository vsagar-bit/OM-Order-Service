package com.ecom.order.repository;


import com.ecom.order.entities.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order,Long> {
}
