package com.cpp.homeWork3.factory;

public class Tuna implements Nutrient {
    private FatsType nutrientName;

    public Tuna() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatsType.TUNA;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
