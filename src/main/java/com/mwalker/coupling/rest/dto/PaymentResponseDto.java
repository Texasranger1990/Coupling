package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.Payment;
import com.mwalker.coupling.model.PaymentState;
import lombok.Data;

@Data
public class PaymentResponseDto {
    private long paymentId;
    private PaymentState paymentState;

    public static PaymentResponseDto fromPayment(Payment input) {
        PaymentResponseDto result = new PaymentResponseDto();
        result.setPaymentId(input.getPaymentId());
        result.setPaymentState(input.getPaymentState());

        return result;
    }
}
