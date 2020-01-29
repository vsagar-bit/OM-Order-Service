package com.ecom.order.repository;

import com.ecom.order.entities.OrderStatus;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderStatusRepository extends ReactiveMongoRepository<OrderStatus,Long> {

}
