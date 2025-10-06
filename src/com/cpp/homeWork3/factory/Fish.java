package com.cpp.homeWork3.factory;

public class Fish implements Nutrient {
    private ProteinTypes nutrientName;

    public Fish() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinTypes.FISH;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
