package org.example.design.patterns.behavioral.strategy;

public class Program {
    public static void main(String[] args) {
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy();
        UPIStrategy upiStrategy = new UPIStrategy();
        PaymentService paymentService = new PaymentService(upiStrategy);
        paymentService.makePayment(100);
    }
}
