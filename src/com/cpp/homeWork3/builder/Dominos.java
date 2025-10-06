package com.cpp.homeWork3.builder;

public class Dominos extends PreparePizza {
    Dominos() {
        super();
        this.setChainName(PizzaChainName.DOMINOS);
    }

    public Pizza prepareSmallPizzaWithOneTopping() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.SAUSAGE).build();
    }

    public Pizza prepareLargePizzaWithThreeToppings() {
        return this.setSize(PizzaSize.LARGE).addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.HAM_AND_PINEAPPLE).addTopping(PizzaTopping.SPICY_PORK).build();
    }
}
