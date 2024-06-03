package com.mwalker.coupling.order.repository;


import com.mwalker.coupling.order.model.Order;
import com.mwalker.coupling.order.repository.entity.OrderEntity;
import com.mwalker.coupling.order.service.OrderConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderConnectorImpl implements OrderConnector {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public boolean doesOrderExist(long orderId) {
        return orderRepository.findById(orderId).isPresent();
    }

    @Override
    public Order upsertOrder(Order order) {
        OrderEntity entity = OrderEntity.fromOrder(order);
        return orderRepository
                .save(entity)
                .toOrder();
    }
}
