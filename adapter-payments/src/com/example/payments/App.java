package com.example.payments;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, PaymentGateway> gateways = new HashMap<>();

        // Register adapters
        gateways.put("fastpay", new FastPayAdapter(new FastPayClient()));
        gateways.put("safecash", new SafeCashAdapter(new SafeCashClient()));

        OrderService orderService = new OrderService(gateways);

        String fastPayTransactionId = orderService.charge("fastpay", "cust-1", 1299);
        String safeCashTransactionId = orderService.charge("safecash", "cust-2", 1299);

        System.out.println(fastPayTransactionId);
        System.out.println(safeCashTransactionId);
    }
}