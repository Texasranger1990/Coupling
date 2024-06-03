package com.mwalker.coupling.rest;

import com.mwalker.coupling.rest.dto.OrderRequestDto;
import com.mwalker.coupling.rest.dto.OrderResponseDto;
import com.mwalker.coupling.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("")
    public OrderResponseDto placeOrder(OrderRequestDto order) {

        return OrderResponseDto.fromOrder(
                orderService.placeOrder(
                        order.toOrder()
                )
        );
    }
}
