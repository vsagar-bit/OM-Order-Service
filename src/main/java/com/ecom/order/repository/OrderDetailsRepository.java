package com.ecom.order.repository;


import com.ecom.order.model.OrderDetails;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface OrderDetailsRepository extends ReactiveMongoRepository<OrderDetails,Long> {
}
