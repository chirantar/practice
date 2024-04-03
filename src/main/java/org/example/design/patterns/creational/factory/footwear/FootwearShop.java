package org.example.design.patterns.creational.factory.footwear;

public abstract class FootwearShop {
    public Footwear getFootwear(){
        return createFootwear();
    }

    public abstract Footwear createFootwear();
}
