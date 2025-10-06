package com.cpp.homeWork3.factory;

public class Tofu implements Nutrient {
    private ProteinTypes nutrientName;

    public Tofu() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinTypes.TOFU;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
