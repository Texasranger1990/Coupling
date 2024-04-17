package com.mwalker.coupling.rest;

import com.mwalker.coupling.rest.dto.PaymentRequestDto;
import com.mwalker.coupling.rest.dto.PaymentResponseDto;
import com.mwalker.coupling.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("")
    public PaymentResponseDto ProcessPayment(PaymentRequestDto payment) {

        return
                PaymentResponseDto.fromPayment(
                        paymentService.processPayment(payment.toPayment())
                );
    }
}
