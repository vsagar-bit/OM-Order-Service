package com.ecom.order.service;

import com.ecom.order.entities.Order;
import com.ecom.order.entities.OrderDetails;
import com.ecom.order.entities.OrderStatus;
import com.ecom.order.repository.OrderDetailsRepository;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.repository.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Autowired
    private OrderStatusRepository orderStatusRepository;


    @Override
    public Mono<Order> createOrder(Order order) {
       return orderRepository.save(order);
    }

    @Override
    public Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public Mono<OrderStatus> getOrderStatus(long orderId) {
        return orderStatusRepository.findById(orderId);

    }

    @Override
    public Mono<Order> getOrder(long orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public Flux<OrderDetails> getOrderDetails(long orderId) {
        Iterable<Long> iterable = () -> {
            List<Long> list = new ArrayList<>();
            list.add(orderId);
            return list.iterator();
        };
        return orderDetailsRepository.findAllById(iterable);
    }
}
