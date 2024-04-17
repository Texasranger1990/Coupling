package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentState;
import com.mwalker.coupling.repository.PaymentRepository;
import com.mwalker.coupling.repository.entity.PaymentEntity;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment processPayment(Payment payment) {
        Optional<PaymentEntity> result = paymentRepository.getById(payment.getPaymentId());
        if(result.isPresent()) {
            if(result.get().getPaymentState() != PaymentState.OPEN) {
                throw new IllegalArgumentException(
                        String.format("Payment with Id %s is not in open state", result.get().getId())
                );
            }
        }
        payment.setPaymentState(PaymentState.FULFILLED);
        return payment;
    }
}
