package com.mwalker.coupling.service;

import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.model.OrderState;
import com.mwalker.coupling.model.exceptions.OrderAlreadyExistsException;
import com.mwalker.coupling.repository.OrderRepository;
import com.mwalker.coupling.repository.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order placeOrder(Order order) {
        Optional<OrderEntity> orderEntity = orderRepository.findById(order.getOrderId());
        if(orderEntity.isPresent()) {
            throw new OrderAlreadyExistsException(order.getOrderId());
        }
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(order.getOrderId());
        entity.setOrderState(OrderState.OPEN);
        entity = orderRepository.save(entity);

        Order result = new Order();
        result.setOrderId(entity.getOrderId());
        result.setOrderState(entity.getOrderState());
        return result;
    }
}
