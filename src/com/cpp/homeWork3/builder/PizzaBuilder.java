package com.cpp.homeWork3.builder;

public interface PizzaBuilder {
    PizzaBuilder setSize(PizzaSize size);

    PizzaBuilder addTopping(PizzaTopping topping);

    Pizza build();
}
