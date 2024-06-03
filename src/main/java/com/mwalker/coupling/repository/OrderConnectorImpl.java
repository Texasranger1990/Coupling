package com.mwalker.coupling.repository;


import com.mwalker.coupling.model.Order;
import com.mwalker.coupling.repository.entity.OrderEntity;
import com.mwalker.coupling.service.OrderConnector;
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
