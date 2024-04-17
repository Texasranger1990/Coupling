package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.rest.dto.PaymentRequestDto;
import com.mwalker.coupling.rest.dto.PaymentResponseDto;
import com.mwalker.coupling.rest.dto.PaymentState;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResponseDto processPayment(PaymentRequestDto paymentRequest) {
        PaymentResponseDto response = new PaymentResponseDto();
        response.setPaymentId(paymentRequest.getPaymentId());
        response.setPaymentState(PaymentState.FULFILLED);
        return response;
    }
}
