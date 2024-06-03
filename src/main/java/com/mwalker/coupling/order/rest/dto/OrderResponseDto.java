package com.mwalker.coupling.order.rest.dto;

import com.mwalker.coupling.order.model.Order;
import com.mwalker.coupling.order.model.OrderState;
import lombok.Data;

@Data
public
class OrderResponseDto {
    private long orderId;
    private OrderState orderState;

    public static OrderResponseDto fromOrder(Order order) {
        OrderResponseDto result = new OrderResponseDto();
        result.setOrderState(order.getOrderState());
        result.setOrderId(order.getOrderId());
        return result;
    }
}
