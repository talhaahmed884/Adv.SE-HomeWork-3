package com.cpp.homeWork3.factory;

public enum ProteinTypes {
    FISH("Fish"),
    CHICKEN("Chicken"),
    BEEF("Beef"),
    TOFU("Tofu");

    private final String displayName;

    ProteinTypes(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
