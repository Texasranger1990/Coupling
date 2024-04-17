package com.mwalker.coupling.model;

import lombok.Data;

@Data
public class PaymentResponse {
    private long paymentId;
    private PaymentState paymentState;
}
