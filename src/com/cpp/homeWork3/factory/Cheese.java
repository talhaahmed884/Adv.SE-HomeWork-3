package com.cpp.homeWork3.factory;

public class Cheese implements Nutrient {
    private CarbTypes nutrientName;

    public Cheese() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbTypes.CHEESE;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
