package com.ecom.order.utilities;

import org.springframework.beans.BeanUtils;

import com.ecom.order.dto.CheckoutDetailsDTO;
import com.ecom.order.dto.OrderDTO;
import com.ecom.order.dto.OrderDetailsDTO;
import com.ecom.order.dto.OrderStatusDTO;
import com.ecom.order.dto.ProductDetailsDTO;
import com.ecom.order.entities.Order;
import com.ecom.order.entities.OrderDetails;
import com.ecom.order.entities.OrderStatus;

public class ConvertionUtiltiy {

    public static Order convertToOrder(OrderDTO orderDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO,order);
        return order;
    }

    public static OrderDTO convertToOrderDTO(Order order) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order,orderDTO);
        return orderDTO;
    }

    public static OrderDetails convertToOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        OrderDetails orderDetails = new OrderDetails();
        BeanUtils.copyProperties(orderDetailsDTO,orderDetails);
        return orderDetails;
    }

    public static OrderDetailsDTO convertToOrderDetailsDTO(OrderDetails orderDet) {
        OrderDetailsDTO orderDetailsDTO = new OrderDetailsDTO();
        BeanUtils.copyProperties(orderDet,orderDetailsDTO);
        return orderDetailsDTO;
    }

    public static OrderStatusDTO convertToOrderStatusDTO(OrderStatus orderStatus) {
        OrderStatusDTO orderStatusDTO = new OrderStatusDTO();
        BeanUtils.copyProperties(orderStatus,orderStatusDTO);
        return orderStatusDTO;
    }
    
}
