package com.mwalker.coupling.service;

import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.model.exceptions.OrderAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderConnector orderConnector;

    @Override
    public Order placeOrder(Order order) {
        if(orderConnector.doesOrderExist(order.getOrderId())) {
            throw new OrderAlreadyExistsException(order.getOrderId());
        }
        return orderConnector.upsertOrder(order);
    }
}
