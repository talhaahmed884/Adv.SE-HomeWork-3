package com.cpp.homeWork3.factory;

public enum DietPlans {
    NO_RESTRICTION("No Restriction"),
    PALEO("Paleo"),
    VEGAN("Vegan"),
    NUT_ALLERGY("Nut Allergy");
    private final String displayName;

    DietPlans(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
