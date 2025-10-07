package com.cpp.homeWork3.factory;

public class Avocado implements Nutrient {
    private FatsType nutrientName;

    public Avocado() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatsType.AVOCADO;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
