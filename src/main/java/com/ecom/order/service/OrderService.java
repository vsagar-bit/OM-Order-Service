package com.ecom.order.service;


import com.ecom.order.entities.Order;
import com.ecom.order.entities.OrderDetails;
import com.ecom.order.entities.OrderStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {

    Mono<Order> createOrder(Order order);
    Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails);
    Mono<OrderStatus> getOrderStatus(long orderId);
    Mono<Order> getOrder(long orderId);
    Flux<OrderDetails> getOrderDetails(long orderId);
}
