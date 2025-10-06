package com.cpp.homeWork3.factory;

public class Tuna implements Nutrient {
    private FatTypes nutrientName;

    public Tuna() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatTypes.TUNA;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
