package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentState;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Payment processPayment(Payment payment) {
        payment.setPaymentState(PaymentState.FULFILLED);
        return payment;
    }
}
