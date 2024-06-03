package com.mwalker.coupling.model;

import lombok.Data;

@Data
public class Order {
    private long orderId;
    private OrderState orderState;
    private long userId;
}
