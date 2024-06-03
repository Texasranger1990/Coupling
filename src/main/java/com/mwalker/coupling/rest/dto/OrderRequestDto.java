package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.Order;
import lombok.Data;

@Data
public class OrderRequestDto {
    private long orderId;

    public Order toOrder() {
        Order order = new Order();
        order.setOrderId(this.orderId);
        return order;
    };
}
