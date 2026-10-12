package com.personalproject.razorpay.payment.service;

import com.personalproject.razorpay.payment.dto.request.CreateOrderRequest;
import com.personalproject.razorpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);
}
