package com.cpp.homeWork3.factory;

public enum ProteinsType {
    FISH("Fish"),
    CHICKEN("Chicken"),
    BEEF("Beef"),
    TOFU("Tofu");

    private final String displayName;

    ProteinsType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
