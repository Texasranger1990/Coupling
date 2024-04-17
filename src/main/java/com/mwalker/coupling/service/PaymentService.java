package com.mwalker.coupling.service;

import com.mwalker.coupling.rest.dto.PaymentRequestDto;
import com.mwalker.coupling.rest.dto.PaymentResponseDto;

public interface PaymentService {
    public PaymentResponseDto processPayment(PaymentRequestDto paymentRequest);
}
