package com.personalproject.razorpay.payment.gateway;

import com.personalproject.razorpay.payment.gateway.dto.PaymentRequest;
import com.personalproject.razorpay.payment.gateway.dto.PaymentResult;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);
}
