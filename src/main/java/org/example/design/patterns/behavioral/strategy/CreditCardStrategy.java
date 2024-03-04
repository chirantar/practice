package org.example.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreditCardStrategy implements PaymentStrategy{
    private String cardNum;
    private String expDate;
    private String cvv;

    @Override
    public boolean makePayment(int amt) {
        System.out.println("Payment by Credit card");
        return true;
    }
}
