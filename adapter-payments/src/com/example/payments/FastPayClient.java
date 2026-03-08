package com.example.payments;

public class FastPayClient {
    public String payNow(String customerId, int amountCents) {
        return "FP#"+ customerId + ":" + amountCents;
    }
}
