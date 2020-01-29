package com.ecom.order.service;


import com.ecom.order.model.Order;
import com.ecom.order.model.OrderDetails;
import com.ecom.order.model.ShoppingCart;
import reactor.core.publisher.Mono;

public interface OrderService {

    Mono<Order> createOrder(Order order);
    Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails);
    Mono<ShoppingCart> addProductToShippingCart(ShoppingCart shoppingCart);
}
