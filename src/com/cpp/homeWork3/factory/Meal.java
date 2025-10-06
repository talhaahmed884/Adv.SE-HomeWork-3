package com.cpp.homeWork3.factory;

import java.util.ArrayList;

public class Meal {
    private final DietPlans dietPlan;
    private final ArrayList<Nutrient> meals;

    public Meal(DietPlans dietPlan) {
        this.dietPlan = dietPlan;
        this.meals = new ArrayList<>();
    }

    void addMeal(Nutrient nutrient) {
        meals.add(nutrient);
    }

    @Override
    public String toString() {
        return String.format("Diet Plan: %s\nMeals: %s\n\n", dietPlan, meals);
    }
}
