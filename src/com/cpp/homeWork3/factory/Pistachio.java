package com.cpp.homeWork3.factory;

public class Pistachio implements Nutrient {
    private CarbTypes nutrientName;

    public Pistachio() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbTypes.PISTACHIO;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
