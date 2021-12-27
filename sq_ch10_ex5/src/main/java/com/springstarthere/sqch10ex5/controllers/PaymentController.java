package com.springstarthere.sqch10ex5.controllers;

import com.springstarthere.sqch10ex5.model.PaymentDetails;
import com.springstarthere.sqch10ex5.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    public final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {

        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
