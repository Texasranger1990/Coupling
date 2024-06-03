package com.mwalker.coupling.order.service;

import com.mwalker.coupling.order.model.Order;

public interface OrderConnector {
    boolean doesOrderExist(long orderId);

    Order upsertOrder(Order order);
}
