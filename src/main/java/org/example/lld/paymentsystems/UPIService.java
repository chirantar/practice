package org.example.lld.paymentsystems;

public class UPIService implements PaymentProcessor{
    public Transaction makePayment(double amt){
        System.out.println("Done payment by upi");
        return new Transaction();
    }
}
