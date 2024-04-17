package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.PaymentRequest;
import com.mwalker.coupling.model.PaymentResponse;
import com.mwalker.coupling.model.PaymentState;
import lombok.Data;

@Data
public class PaymentResponseDto {
    private long paymentId;
    private PaymentState paymentState;

    public static PaymentResponseDto fromPaymentResponse(PaymentResponse input) {
        PaymentResponseDto result = new PaymentResponseDto();
        result.setPaymentId(input.getPaymentId());
        result.setPaymentState(input.getPaymentState());

        return result;
    }
}
