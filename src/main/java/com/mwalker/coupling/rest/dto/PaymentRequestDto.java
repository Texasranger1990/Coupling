package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentMethod;
import com.mwalker.coupling.model.PaymentState;
import lombok.Data;

@Data
public class PaymentRequestDto {
    private long paymentId;
    private PaymentMethod paymentMethod;

    public Payment toPayment() {
        Payment result = new Payment();
        result.setPaymentId(this.paymentId);
        result.setPaymentMethod(this.paymentMethod);
        result.setPaymentState(PaymentState.OPEN);
        return result;
    }
}
