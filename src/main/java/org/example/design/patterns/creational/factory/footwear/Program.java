package org.example.design.patterns.creational.factory.footwear;

public class Program {
    public static void main(String[] args) {
        ShoeFootwearShop shoeFootwearShop = new ShoeFootwearShop();
        Footwear shoe = shoeFootwearShop.getFootwear();

        SlipperFootwearShop slipperFootwearShop = new SlipperFootwearShop();
        Footwear slipper = slipperFootwearShop.getFootwear();
    }
}
