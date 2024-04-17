package com.mwalker.coupling.repository.entity;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentMethod;
import com.mwalker.coupling.model.PaymentState;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PaymentEntity {
    @Id
    private Long paymentId;

    private PaymentState paymentState;

    private PaymentMethod paymentMethod;

    public Payment toPayment() {
        Payment result = new Payment();
        result.setPaymentState(this.paymentState);
        result.setPaymentId(this.paymentId);
        result.setPaymentMethod(this.paymentMethod);
        return result;
    }
}
