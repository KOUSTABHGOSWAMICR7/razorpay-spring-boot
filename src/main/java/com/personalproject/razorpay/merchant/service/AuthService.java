package com.personalproject.razorpay.merchant.service;

import com.personalproject.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.personalproject.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}
