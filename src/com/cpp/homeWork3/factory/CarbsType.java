package com.cpp.homeWork3.factory;

public enum CarbsType {
    CHEESE("Cheese"),
    BREAD("Bread"),
    LENTILS("Lentils"),
    PISTACHIO("Pistachio");

    private final String displayName;

    CarbsType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
