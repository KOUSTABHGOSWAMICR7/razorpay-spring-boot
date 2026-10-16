package com.personalproject.razorpay.payment.processor.strategy;

import com.personalproject.razorpay.payment.processor.PaymentProcessor;
import com.personalproject.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.personalproject.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}
