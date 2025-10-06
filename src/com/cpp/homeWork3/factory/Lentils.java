package com.cpp.homeWork3.factory;

public class Lentils implements Nutrient {
    private CarbTypes nutrientName;

    public Lentils() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbTypes.LENTILS;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
