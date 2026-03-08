package com.example.payments;

public class SafeCashClient {
    public SafeCashPayment createPayment(int amountCents, String customerId) {
        return new SafeCashPayment(amountCents, customerId);
    }
}