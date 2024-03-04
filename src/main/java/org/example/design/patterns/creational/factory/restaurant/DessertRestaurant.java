package org.example.design.patterns.creational.factory.restaurant;

public class DessertRestaurant extends Restaurant{
    @Override
    public Dish createDish() {
        return new Dessert();
    }
}
