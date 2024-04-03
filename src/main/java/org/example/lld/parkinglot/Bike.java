package org.example.lld.parkinglot;

import org.example.lld.parkinglot.Vehicle;

public class Bike extends Vehicle {
    static final int PRICE = 20;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
