package com.springstarthere.sqch10ex5.services;

import com.springstarthere.sqch10ex5.exceptions.NotEnoughMoneyException;
import com.springstarthere.sqch10ex5.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
