package com.cpp.homeWork3.builder;

abstract class PreparePizza implements PizzaBuilder {
    private Pizza pizza;

    public PreparePizza() {
        this.pizza = new Pizza();
    }

    void setChainName(PizzaChainName pizzaChainName) {
        this.pizza.setChainName(pizzaChainName);
    }

    @Override
    public PizzaBuilder setSize(PizzaSize size) {
        this.pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(PizzaTopping topping) {
        this.pizza.addTopping(topping);
        return this;
    }

    @Override
    public Pizza build() {
        this.verifyBuildExceptions();

        Pizza preparedPizza = this.pizza;
        this.reset();
        return preparedPizza;
    }

    private void verifyBuildExceptions() {
        if (this.pizza.getSize() == null) {
            throw new IllegalStateException("Pizza size is not provided. Pizza size can not be null.");
        }
    }

    private void reset() {
        this.pizza = new Pizza(this.pizza.getChainName());
    }
}
