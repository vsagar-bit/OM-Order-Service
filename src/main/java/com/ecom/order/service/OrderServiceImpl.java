package com.ecom.order.service;

import com.ecom.order.dto.OrderDTO;
import com.ecom.order.dto.OrderDetailsDTO;
import com.ecom.order.dto.OrderStatusDTO;
import com.ecom.order.entities.Order;
import com.ecom.order.entities.OrderDetails;
import com.ecom.order.entities.OrderStatus;
import com.ecom.order.repository.OrderDetailsRepository;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.repository.OrderStatusRepository;
import com.ecom.order.utilities.ConvertionUtiltiy;
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
    public Mono<OrderDTO> createOrder(OrderDTO orderDTO) {
        Order order = ConvertionUtiltiy.convertToOrder(orderDTO);
         return orderRepository.save(order)
                .map(ord -> ConvertionUtiltiy.convertToOrderDTO(ord));

    }

    @Override
    public Mono<OrderDetailsDTO> createOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        OrderDetails orderDetails = ConvertionUtiltiy.convertToOrderDetails(orderDetailsDTO);
        return orderDetailsRepository.save(orderDetails)
                .map(orderDet -> ConvertionUtiltiy.convertToOrderDetailsDTO(orderDet));
    }

    @Override
    public Mono<OrderStatusDTO> getOrderStatus(Long orderId) {
        return orderStatusRepository.findById(orderId)
                .map(orderStatus -> ConvertionUtiltiy.convertToOrderStatusDTO(orderStatus));

    }

    @Override
    public Mono<OrderDTO> getOrder(Long orderId) {
        return orderRepository.findById(orderId)
                .map(order -> ConvertionUtiltiy.convertToOrderDTO(order));
    }

    @Override
    public Flux<OrderDetailsDTO> getOrderDetails(Long orderId) {
        Iterable<Long> iterable = () -> {
            List<Long> list = new ArrayList<>();
            list.add(orderId);
            return list.iterator();
        };
        return orderDetailsRepository.findAllById(iterable)
                .map(orderDetails -> ConvertionUtiltiy.convertToOrderDetailsDTO(orderDetails));
    }

    @Override
    public Flux<OrderDTO> getAllOrders(Long customerId) {
              Iterable<Long> iterable = () -> {
                  List<Long> list = new ArrayList<>();
                  list.add(customerId);
                  return list.iterator();
              };
              return orderRepository.findAllById(iterable)
                      .map(order -> ConvertionUtiltiy.convertToOrderDTO(order));

    }

    @Override
    public Mono<OrderStatusDTO> cancelOrder(OrderStatusDTO orderStatusDTO) {
        OrderStatus orderStatus = ConvertionUtiltiy.convertToOrderStatus(orderStatusDTO);
        return orderStatusRepository.save(orderStatus).map(ordStatus -> ConvertionUtiltiy.convertToOrderStatusDTO(ordStatus));
    }

}
