package org.example.lld.parkinglot;

public class Car extends Vehicle{
    static final int PRICE = 40;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
