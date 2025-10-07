package com.cpp.homeWork3.factory;

public class Tofu implements Nutrient {
    private ProteinsType nutrientName;

    public Tofu() {
        this.prepare();
    }

    @Override
    public void prepare() {
        this.nutrientName = ProteinsType.TOFU;
    }

    @Override
    public String toString() {
        return this.nutrientName.toString();
    }
}
