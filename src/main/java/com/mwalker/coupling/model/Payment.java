package com.mwalker.coupling.model;

import lombok.Data;

@Data
public class Payment {
    private long paymentId;
    private PaymentMethod paymentMethod;
    private PaymentState paymentState;
}
