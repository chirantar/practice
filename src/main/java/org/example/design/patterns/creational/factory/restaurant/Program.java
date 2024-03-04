package org.example.design.patterns.creational.factory.restaurant;

public class Program {
    public static void main(String[] args) {
        Restaurant restaurant = new AppetizerRestaurant();
        Dish dish = restaurant.getDish();

        Restaurant restaurant1 = new DessertRestaurant();
        Dish dish1 = restaurant1.getDish();
    }
}
