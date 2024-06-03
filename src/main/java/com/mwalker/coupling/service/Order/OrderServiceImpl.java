package com.mwalker.coupling.service.Order;

import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.model.exceptions.OrderAlreadyExistsException;
import com.mwalker.coupling.model.exceptions.UserIsNotAllowedToOrderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderConnector orderConnector;

    @Autowired
    private UserService userService;

    @Override
    public Order placeOrder(Order order) {
        if(!userService.canOrder(order.getUserId())) {
            throw new UserIsNotAllowedToOrderException(order.getUserId());
        }
        if(orderConnector.doesOrderExist(order.getOrderId())) {
            throw new OrderAlreadyExistsException(order.getOrderId());
        }
        return orderConnector.upsertOrder(order);
    }
}
