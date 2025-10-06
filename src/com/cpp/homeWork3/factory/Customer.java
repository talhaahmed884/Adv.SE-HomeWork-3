package com.cpp.homeWork3.factory;

public class Customer {
    private final String name;
    private final Meal meal;


    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        meal = dietPlan.prepareMeal();
    }

    @Override
    public String toString() {
        return String.format("Customer name: %s\n%s", this.name, this.meal);
    }
}
