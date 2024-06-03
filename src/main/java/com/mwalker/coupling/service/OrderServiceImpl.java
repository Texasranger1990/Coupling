package com.mwalker.coupling.service;

import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.model.OrderState;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public Order placeOrder(Order order) {
        Order result = new Order();
        result.setOrderId(order.getOrderId());
        result.setOrderState(OrderState.OPEN);
        return result;
    }
}
