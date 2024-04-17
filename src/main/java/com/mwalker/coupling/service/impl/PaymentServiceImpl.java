package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentState;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDataFetcher dataFetcher;

    @Override
    public Payment processPayment(Payment payment) {
        Payment result = dataFetcher.getById(payment.getPaymentId());
        if(result.getPaymentState() != PaymentState.OPEN) {
            throw new IllegalArgumentException(
                    String.format("Payment with Id %s is not in open state", result.getPaymentId())
            );
        }
        payment.setPaymentState(PaymentState.FULFILLED);
        return payment;
    }
}
