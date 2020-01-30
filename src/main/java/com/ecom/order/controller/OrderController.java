package com.ecom.order.controller;


import com.ecom.order.dto.OrderDTO;
import com.ecom.order.dto.OrderDetailsDTO;
import com.ecom.order.dto.OrderStatusDTO;
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
    public Mono<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }


    @PostMapping("/orderdetails")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderDetailsDTO> createOrderDetails(@RequestBody OrderDetailsDTO orderDetailsDTO) {
        return orderService.createOrderDetails(orderDetailsDTO);
    }

    @GetMapping("/orderStatus/{orderId}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderStatusDTO> getOrderStatus(@PathVariable("orderId") Long orderId) {
      return orderService.getOrderStatus(orderId);
    }

    @GetMapping("/orderdetails/{orderId}")
    @ResponseStatus(HttpStatus.CREATED.OK)
    public Flux<OrderDetailsDTO> getOrderDetails(@PathVariable("orderId") Long orderId) {
        return orderService.getOrderDetails(orderId);
    }



}
