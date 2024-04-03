package org.example.design.patterns.creational.factory.footwear;

public class SlipperFootwearShop extends FootwearShop{
    @Override
    public Footwear createFootwear() {
        return new Slippers();
    }
}
