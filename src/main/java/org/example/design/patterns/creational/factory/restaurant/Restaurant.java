package org.example.design.patterns.creational.factory.restaurant;

public abstract class Restaurant {
    public Dish getDish(){
        Dish dish = createDish();
        return dish;
    }

    public abstract Dish createDish();
}
