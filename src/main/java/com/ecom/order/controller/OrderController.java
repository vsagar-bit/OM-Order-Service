package com.ecom.order.controller;


import com.ecom.order.entities.Order;
import com.ecom.order.entities.OrderDetails;
import com.ecom.order.entities.OrderStatus;
import com.ecom.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orderManagement")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Order> createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }


    @PostMapping("/orderdetails")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderDetails> createOrderDetails(@RequestBody OrderDetails orderDetails) {
        return orderService.createOrderDetails(orderDetails);
    }

    @GetMapping("/orderStatus/{orderId}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderStatus> getOrderStatus(@PathVariable("orderId") long orderId) {
      return orderService.getOrderStatus(orderId);
    }

    @GetMapping("/orderdetails/{orderId}")
    @ResponseStatus(HttpStatus.CREATED.OK)
    public Flux<OrderDetails> getOrderDetails(@PathVariable("orderId") long orderId) {
        return orderService.getOrderDetails(orderId);
    }



}
