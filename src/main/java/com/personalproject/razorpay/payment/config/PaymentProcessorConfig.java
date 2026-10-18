package com.personalproject.razorpay.payment.config;

import com.personalproject.razorpay.common.enums.PaymentMethod;
import com.personalproject.razorpay.payment.processor.PaymentProcessor;
import com.personalproject.razorpay.payment.processor.strategy.UpiPaymentProcessor;
import com.personalproject.razorpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.personalproject.razorpay.payment.processor.strategy.CardPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {

    @Bean
    public Map<PaymentMethod, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethod.CARD, new CardPaymentProcessor(),
                PaymentMethod.NETBANKING, new NetBankingPaymentProcessor(),
                PaymentMethod.UPI, new UpiPaymentProcessor()
        );
    }
}
