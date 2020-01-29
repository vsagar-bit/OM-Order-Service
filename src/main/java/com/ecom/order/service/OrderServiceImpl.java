package com.ecom.order.service;

import com.ecom.order.model.Order;
import com.ecom.order.model.OrderDetails;
import com.ecom.order.model.ShoppingCart;
import com.ecom.order.repository.OrderDetailsRepository;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;


    @Autowired
    private ShoppingCartRepository shoppingCartRepository;


    @Override
    public Mono<Order> createOrder(Order order) {
       return orderRepository.save(order);
    }

    @Override
    public Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public Mono<ShoppingCart> addProductToShippingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }
}
