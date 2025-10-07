package com.cpp.homeWork3.factory;

public class Peanuts implements Nutrient {
    private FatsType nutrientName;

    public Peanuts() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatsType.PEANUTS;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
