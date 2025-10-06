package com.cpp.homeWork3.factory;

public class Peanuts implements Nutrient {
    private FatTypes nutrientName;

    public Peanuts() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatTypes.PEANUTS;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
