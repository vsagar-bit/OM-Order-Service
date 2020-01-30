package com.ecom.order.service;

import com.ecom.order.dto.OrderDTO;
import com.ecom.order.dto.OrderDetailsDTO;
import com.ecom.order.dto.OrderStatusDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {

    Mono<OrderDTO> createOrder(OrderDTO order);
    Mono<OrderDetailsDTO> createOrderDetails(OrderDetailsDTO orderDetails);
    Mono<OrderStatusDTO> getOrderStatus(Long orderId);
    Mono<OrderDTO> getOrder(Long orderId);
    Flux<OrderDetailsDTO> getOrderDetails(Long orderId);
}
