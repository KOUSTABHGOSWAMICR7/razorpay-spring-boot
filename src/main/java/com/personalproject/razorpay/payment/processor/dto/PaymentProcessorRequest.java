package com.personalproject.razorpay.payment.processor.dto;

import com.personalproject.razorpay.common.entity.Money;
import com.personalproject.razorpay.common.enums.PaymentMethod;

import java.util.Map;

public record PaymentProcessorRequest(
        PaymentMethod method,
        Money amount,
        Map<String, Object> methodDetails
) {
}
