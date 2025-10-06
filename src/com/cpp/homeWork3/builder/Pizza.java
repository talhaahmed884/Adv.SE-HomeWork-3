package com.cpp.homeWork3.builder;

import java.util.ArrayList;

public class Pizza {
    private final ArrayList<PizzaTopping> toppings;
    private PizzaChainName chainName;
    private PizzaSize size;

    public Pizza() {
        this.toppings = new ArrayList<>();
        this.chainName = null;
        this.size = null;
    }

    protected Pizza(PizzaChainName chainName) {
        this.toppings = new ArrayList<>();
        this.chainName = chainName;
        this.size = null;
    }

    public void addTopping(PizzaTopping topping) {
        this.toppings.add(topping);
    }

    public PizzaChainName getChainName() {
        return this.chainName;
    }

    public void setChainName(PizzaChainName chainName) {
        this.chainName = chainName;
    }

    public PizzaSize getSize() {
        return this.size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void eat() {
        System.out.println(this);
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Pizza Chain: %s\nPizza Size: %s\nPizza Toppings: %s\n", this.chainName,
                this.size, this.toppings);
    }
}
