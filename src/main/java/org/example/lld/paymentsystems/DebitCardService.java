package org.example.lld.paymentsystems;

public class DebitCardService implements PaymentProcessor {
    public Transaction makePayment(double amt){
        System.out.println("Done payment by Dbt card");
        return new Transaction();
    }
}
