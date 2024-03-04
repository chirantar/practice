package org.example.design.patterns.creational.factory.restaurant;

public class AppetizerRestaurant extends Restaurant{

    @Override
    public Dish createDish() {
        return new Appetizers();
    }
}
