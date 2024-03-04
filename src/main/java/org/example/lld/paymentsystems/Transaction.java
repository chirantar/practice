package org.example.lld.paymentsystems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private String id;
    private double amt;
    private PaymentMode mode;
    private LocalDate date;
    private TransactionStatus status;
}
