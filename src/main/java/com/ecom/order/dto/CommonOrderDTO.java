package com.ecom.order.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonOrderDTO {

    private OrderDTO orderDTO;
    private OrderStatusDTO orderStatusDTO;
}
