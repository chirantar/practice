package org.example.lld.paymentsystems;

public class PaymentService extends Object {
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public Transaction makePayment(double amount){
        return paymentProcessor.makePayment(amount);
    }
}
