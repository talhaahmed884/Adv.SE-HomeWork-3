package com.cpp.homeWork3.factory;

public class Cheese implements Nutrient {
    private CarbsType nutrientName;

    public Cheese() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbsType.CHEESE;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
