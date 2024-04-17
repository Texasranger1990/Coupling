package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.model.PaymentRequest;
import com.mwalker.coupling.model.PaymentResponse;
import com.mwalker.coupling.model.PaymentState;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentRequest.getPaymentId());
        response.setPaymentState(PaymentState.FULFILLED);
        return response;
    }
}
