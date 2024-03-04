package org.example.design.patterns.behavioral.strategy;

public class PaymentService {
    private final PaymentStrategy paymentStrategy;
    private int amt;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amt){
        paymentStrategy.makePayment(amt);
    }
}
