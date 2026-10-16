package com.personalproject.razorpay.payment.gateway;

import com.personalproject.razorpay.common.enums.PaymentMethod;
import com.personalproject.razorpay.payment.gateway.dto.PaymentRequest;
import com.personalproject.razorpay.payment.gateway.dto.PaymentResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PaymentGatewayRouter {

    private final Map<PaymentMethod, PaymentAdapter> paymentAdapters;

    public PaymentResult initiate(PaymentRequest request) {
        PaymentAdapter adapter = paymentAdapters.get(request.method());
        if (adapter == null) {
            throw new IllegalArgumentException("No payment adapter registered for method: "+request.method());
        }
        return adapter.initiate(request);
    }
}
