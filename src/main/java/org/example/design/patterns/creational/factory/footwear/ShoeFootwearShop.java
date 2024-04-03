package org.example.design.patterns.creational.factory.footwear;

public class ShoeFootwearShop extends FootwearShop{
    @Override
    public Footwear createFootwear() {
        return new Shoes();
    }
}
