package com.mwalker.coupling.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private long paymentId;
    private PaymentMethod paymentMethod;
}
