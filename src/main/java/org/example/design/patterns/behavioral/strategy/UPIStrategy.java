package org.example.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UPIStrategy implements PaymentStrategy {
    private String upiId;
    public boolean makePayment(int amt){
        System.out.println("Payment by UPI");
        return true;
    }
}
