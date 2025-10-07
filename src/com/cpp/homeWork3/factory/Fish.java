package com.cpp.homeWork3.factory;

public class Fish implements Nutrient {
    private ProteinsType nutrientName;

    public Fish() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinsType.FISH;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
