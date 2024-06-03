package com.mwalker.coupling.order.service;

import com.mwalker.coupling.order.model.Order;

public interface OrderService {
    Order placeOrder(Order order);
}
