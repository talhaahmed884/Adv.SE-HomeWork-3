package com.cpp.homeWork3.factory;

public class Beef implements Nutrient {
    private ProteinTypes nutrientName;

    public Beef() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinTypes.BEEF;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
