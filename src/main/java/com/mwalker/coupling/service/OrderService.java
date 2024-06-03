package com.mwalker.coupling.service;

import com.mwalker.coupling.rest.dto.OrderRequestDto;
import com.mwalker.coupling.rest.dto.OrderResponseDto;

public interface OrderService {
    OrderResponseDto placeOrder(OrderRequestDto order);
}
