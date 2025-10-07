package com.cpp.homeWork3.factory;

public class Pistachio implements Nutrient {
    private CarbsType nutrientName;

    public Pistachio() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = CarbsType.PISTACHIO;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
