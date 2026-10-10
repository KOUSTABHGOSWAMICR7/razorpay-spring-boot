package com.personalproject.razorpay.merchant.service;

import com.personalproject.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.personalproject.razorpay.merchant.dto.response.ApiKeyCreateResponse;

import java.util.UUID;

public interface ApiKeyService {

    ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);
}
