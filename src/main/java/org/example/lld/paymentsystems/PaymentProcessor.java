package org.example.lld.paymentsystems;

public interface PaymentProcessor {
    Transaction makePayment(double amt);
}
