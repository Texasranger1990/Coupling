package com.mwalker.coupling.repository.entity;

import com.mwalker.coupling.model.PaymentMethod;
import com.mwalker.coupling.model.PaymentState;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PaymentEntity {
    @Id
    private Long id;

    private PaymentState paymentState;

    private PaymentMethod paymentMethod;
}
