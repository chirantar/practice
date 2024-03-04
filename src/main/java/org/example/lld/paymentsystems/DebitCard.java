package org.example.lld.paymentsystems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DebitCard {
    private long cardNum;
    private int cvv;
    private LocalDate expiry;
    private String name;
}
