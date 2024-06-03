package com.mwalker.coupling.rest.dto;

import lombok.Data;

@Data
public class OrderResponseDto {
    private long orderId;
    private OrderState orderState;
}
