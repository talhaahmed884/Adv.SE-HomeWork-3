package com.cpp.homeWork3.factory;

public class Chicken implements Nutrient {
    private ProteinsType nutrientName;

    public Chicken() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinsType.CHICKEN;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
