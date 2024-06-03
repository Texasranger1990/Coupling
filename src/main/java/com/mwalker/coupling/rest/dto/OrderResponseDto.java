package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.model.OrderState;
import lombok.Data;

@Data
public class OrderResponseDto {
    private long orderId;
    private OrderState orderState;

    public static OrderResponseDto fromOrder(Order order) {
        OrderResponseDto result = new OrderResponseDto();
        result.setOrderState(order.getOrderState());
        result.setOrderId(order.getOrderId());
        return result;
    }
}
