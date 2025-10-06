package com.cpp.homeWork3.builder;

public class LittleCaesars extends PreparePizza {
    public LittleCaesars() {
        super();
        this.setChainName(PizzaChainName.LITTLE_CAESARS);
    }

    public Pizza prepareMediumPizzaWithEightToppings() {
        return this.setSize(PizzaSize.MEDIUM).addTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .addTopping(PizzaTopping.SPICY_PORK).addTopping(PizzaTopping.PESTO).addTopping(PizzaTopping.HAM)
                .addTopping(PizzaTopping.BEEF).addTopping(PizzaTopping.TOMATO_AND_BASIL)
                .addTopping(PizzaTopping.SPINACH).addTopping(PizzaTopping.OLIVES).build();
    }

    public Pizza prepareSmallPizzaWithSixToppings() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.CHICKEN).addTopping(PizzaTopping.PEPPERS)
                .addTopping(PizzaTopping.EXTRA_CHEESE).addTopping(PizzaTopping.ONIONS).addTopping(PizzaTopping.BACON)
                .addTopping(PizzaTopping.MUSHROOMS).build();
    }
}
