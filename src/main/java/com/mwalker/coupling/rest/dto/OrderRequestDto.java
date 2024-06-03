package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.Order;
import lombok.Data;

@Data
public class OrderRequestDto {
    private long orderId;
    private long userId;

    public Order toOrder() {
        Order order = new Order();
        order.setOrderId(this.orderId);
        order.setUserId(this.userId);
        return order;
    };
}
