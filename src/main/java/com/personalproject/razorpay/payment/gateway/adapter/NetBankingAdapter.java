package com.personalproject.razorpay.payment.gateway.adapter;

import com.personalproject.razorpay.payment.gateway.PaymentAdapter;
import com.personalproject.razorpay.payment.gateway.dto.PaymentRequest;
import com.personalproject.razorpay.payment.gateway.dto.PaymentResult;

public class NetBankingAdapter implements PaymentAdapter {

    @Override
    public PaymentResult initiate(PaymentRequest request) {
        return null;
    }
}
