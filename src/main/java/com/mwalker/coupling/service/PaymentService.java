package com.mwalker.coupling.service;

import com.mwalker.coupling.model.PaymentRequest;
import com.mwalker.coupling.model.PaymentResponse;

public interface PaymentService {
    public PaymentResponse processPayment(PaymentRequest paymentRequest);
}
