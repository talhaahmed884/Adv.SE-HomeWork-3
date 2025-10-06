package com.cpp.homeWork3.factory;

public enum FatTypes {
    AVOCADO("Avocado"),
    SOUR_CREAM("Source Cream"),
    TUNA("Tuna"),
    PEANUTS("Peanuts");

    private final String displayName;

    FatTypes(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
