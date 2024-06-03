package com.mwalker.coupling.service;

import com.mwalker.coupling.rest.dto.OrderRequestDto;
import com.mwalker.coupling.rest.dto.OrderResponseDto;
import com.mwalker.coupling.rest.dto.OrderState;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public OrderResponseDto placeOrder(OrderRequestDto order) {
        OrderResponseDto result = new OrderResponseDto();
        result.setOrderId(order.getOrderId());
        result.setOrderState(OrderState.OPEN);
        return result;
    }
}
