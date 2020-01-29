package com.ecom.order.repository;


import com.ecom.order.model.ShoppingCart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ShoppingCartRepository extends ReactiveMongoRepository<ShoppingCart,Long> {
}