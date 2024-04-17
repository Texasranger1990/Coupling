package com.mwalker.coupling.service;

import com.mwalker.coupling.model.Payment;

public interface PaymentService {
    Payment processPayment(Payment paymentRequest);
}