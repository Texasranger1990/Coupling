package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.PaymentMethod;
import com.mwalker.coupling.model.PaymentRequest;
import lombok.Data;

@Data
public class PaymentRequestDto {
    private long paymentId;
    private PaymentMethod paymentMethod;

    public PaymentRequest toPaymentRequest() {
        PaymentRequest result = new PaymentRequest();
        result.setPaymentId(this.paymentId);
        result.setPaymentMethod(this.paymentMethod);
        return result;
    }
}
