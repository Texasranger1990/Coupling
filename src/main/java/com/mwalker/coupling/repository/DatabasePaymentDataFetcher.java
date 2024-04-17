package com.mwalker.coupling.repository;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.repository.entity.PaymentEntity;
import com.mwalker.coupling.service.impl.PaymentDataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabasePaymentDataFetcher implements PaymentDataFetcher {
    @Autowired
    private PaymentRepository repository;

    public Payment getById(long id) {
        return repository.getById(id).orElse(new PaymentEntity()).toPayment();
    }
}
