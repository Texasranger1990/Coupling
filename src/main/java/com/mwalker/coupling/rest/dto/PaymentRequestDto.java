package com.mwalker.coupling.rest.dto;

import lombok.Data;

@Data
public class PaymentRequestDto {
    private long paymentId;
    private PaymentMethod paymentMethod;
}
