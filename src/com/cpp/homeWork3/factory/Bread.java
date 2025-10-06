package com.cpp.homeWork3.factory;

public class Bread implements Nutrient {
    private CarbTypes nutrientName;

    public Bread() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbTypes.BREAD;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
