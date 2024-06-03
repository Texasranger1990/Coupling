package com.mwalker.coupling.service.Order;

import com.mwalker.coupling.model.Order;

public interface OrderConnector {
    boolean doesOrderExist(long orderId);

    Order upsertOrder(Order order);
}
