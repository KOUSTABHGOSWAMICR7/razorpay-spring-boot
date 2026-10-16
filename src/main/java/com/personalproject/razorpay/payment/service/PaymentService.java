package com.personalproject.razorpay.payment.service;

import com.personalproject.razorpay.payment.dto.request.PaymentInitRequest;
import com.personalproject.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentInitRequest request);
}
