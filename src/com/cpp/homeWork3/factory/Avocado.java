package com.cpp.homeWork3.factory;

public class Avocado implements Nutrient {
    private FatTypes nutrientName;

    public Avocado() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatTypes.AVOCADO;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
