package com.mwalker.coupling.rest.dto;

import lombok.Data;

@Data
public class PaymentResponseDto {
    private long paymentId;
    private PaymentState paymentState;
}
