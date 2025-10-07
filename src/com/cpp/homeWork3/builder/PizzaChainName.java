package com.cpp.homeWork3.builder;

public enum PizzaChainName {
    PIZZA_HUT("Pizza Hut"),
    LITTLE_CAESARS("Little Caesars"),
    DOMINOS("Dominos");

    private final String displayName;

    PizzaChainName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
