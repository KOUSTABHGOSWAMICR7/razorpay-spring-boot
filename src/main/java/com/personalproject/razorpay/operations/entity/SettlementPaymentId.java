package com.personalproject.razorpay.operations.entity;

import com.personalproject.razorpay.common.entity.BaseEntity;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class SettlementPaymentId extends BaseEntity {

    private UUID settlementId;

    private UUID paymentId;
}
