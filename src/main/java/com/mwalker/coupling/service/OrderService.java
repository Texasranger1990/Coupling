package com.mwalker.coupling.service;

import com.mwalker.coupling.model.Order;

public interface OrderService {
    Order placeOrder(Order order);
}
