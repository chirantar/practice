package org.example.lld.paymentsystems;

public class CreditCardService implements PaymentProcessor {
    public Transaction makePayment(double amt){
        System.out.println("Done payment by CC");
        return new Transaction();
    }
}
