package com.example.payments;

public class SafeCashPayment {
    private final int amountCents;
    private final String customerId;
    public SafeCashPayment(int amountCents, String customerId){ this.amountCents = amountCents; this.customerId = customerId; }
    public String confirm(){ return "SC#pay(" + customerId + "," + amountCents + ")"; }
}