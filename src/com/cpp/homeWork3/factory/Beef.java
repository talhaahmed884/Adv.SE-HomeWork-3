package com.cpp.homeWork3.factory;

public class Beef implements Nutrient {
    private ProteinsType nutrientName;

    public Beef() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinsType.BEEF;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
