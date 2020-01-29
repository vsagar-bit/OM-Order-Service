package com.ecom.order.controller;


import com.ecom.order.model.Order;
import com.ecom.order.model.OrderDetails;
import com.ecom.order.model.ShoppingCart;
import com.ecom.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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


    @PostMapping("/productToCart")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ShoppingCart> addProductToShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return orderService.addProductToShippingCart(shoppingCart);
    }

}
