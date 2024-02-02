package com.example.spring.service;

import com.example.spring.exception.NotEnoughMoneyException;
import com.example.spring.details.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
