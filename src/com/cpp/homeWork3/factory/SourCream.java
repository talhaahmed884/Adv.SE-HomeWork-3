package com.cpp.homeWork3.factory;

public class SourCream implements Nutrient {
    private FatTypes nutrientName;

    public SourCream() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = FatTypes.SOUR_CREAM;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
