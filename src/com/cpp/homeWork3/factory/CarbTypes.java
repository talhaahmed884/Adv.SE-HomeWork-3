package com.cpp.homeWork3.factory;

public enum CarbTypes {
    CHEESE("Cheese"),
    BREAD("Bread"),
    LENTILS("Lentils"),
    PISTACHIO("Pistachio");

    private final String displayName;

    CarbTypes(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
