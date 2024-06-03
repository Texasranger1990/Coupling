package com.mwalker.coupling.order.model;

import lombok.Data;

@Data
public class Order {
    private long orderId;
    private OrderState orderState;
    private long userId;
}
