package com.cpp.homeWork3.factory;

public class Chicken implements Nutrient {
    private ProteinTypes nutrientName;

    public Chicken() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinTypes.CHICKEN;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
