package com.cpp.homeWork3.factory;

public class Lentils implements Nutrient {
    private CarbsType nutrientName;

    public Lentils() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbsType.LENTILS;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
