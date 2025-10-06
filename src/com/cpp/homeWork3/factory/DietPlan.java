package com.cpp.homeWork3.factory;

public abstract class DietPlan {
    public abstract Meal prepareMeal();

    public abstract boolean declineNutrient(Nutrient nutrient);
}
