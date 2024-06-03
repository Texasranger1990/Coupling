package com.mwalker.coupling.rest;

import com.mwalker.coupling.rest.dto.OrderRequestDto;
import com.mwalker.coupling.rest.dto.OrderResponseDto;
import com.mwalker.coupling.service.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public OrderResponseDto placeOrder(OrderRequestDto order) {

        return OrderResponseDto.fromOrder(
                orderService.placeOrder(
                        order.toOrder()
                )
        );
    }
}
