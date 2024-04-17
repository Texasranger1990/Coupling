package com.mwalker.coupling.repository;

import com.mwalker.coupling.repository.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {
    Optional<PaymentEntity> getById(long paymentId);
}
