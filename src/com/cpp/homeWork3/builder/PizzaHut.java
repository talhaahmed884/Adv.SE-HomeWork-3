package com.cpp.homeWork3.builder;

public class PizzaHut extends PreparePizza {
    public PizzaHut() {
        super();
        this.setChainName(PizzaChainName.PIZZA_HUT);
    }

    public Pizza prepareSmallPizzaWithTwoToppings() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.PESTO).addTopping(PizzaTopping.HAM).build();
    }

    public Pizza prepareSmallPizzaWithThreeToppings() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.PEPPERONI).addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.MUSHROOMS).build();
    }

    public Pizza prepareSmallPizzaWithSixToppings() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.PEPPERONI).addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.MUSHROOMS).addTopping(PizzaTopping.BACON).addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.EXTRA_CHEESE).build();
    }

    public Pizza prepareSmallPizzaWithNineToppings() {
        return this.setSize(PizzaSize.SMALL).addTopping(PizzaTopping.PEPPERONI).addTopping(PizzaTopping.SAUSAGE)
                .addTopping(PizzaTopping.MUSHROOMS).addTopping(PizzaTopping.BACON).addTopping(PizzaTopping.ONIONS)
                .addTopping(PizzaTopping.EXTRA_CHEESE).addTopping(PizzaTopping.PEPPERS).addTopping(PizzaTopping.CHICKEN)
                .addTopping(PizzaTopping.OLIVES).build();
    }

    public Pizza prepareMediumPizzaWithThreeToppings() {
        return this.setSize(PizzaSize.MEDIUM).addTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .addTopping(PizzaTopping.SPICY_PORK).addTopping(PizzaTopping.PESTO).build();
    }

    public Pizza prepareMediumPizzaWithSixToppings() {
        return this.setSize(PizzaSize.MEDIUM).addTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .addTopping(PizzaTopping.SPICY_PORK).addTopping(PizzaTopping.PESTO).addTopping(PizzaTopping.HAM)
                .addTopping(PizzaTopping.BEEF).addTopping(PizzaTopping.TOMATO_AND_BASIL).build();
    }

    public Pizza prepareMediumPizzaWithNineToppings() {
        return this.setSize(PizzaSize.MEDIUM).addTopping(PizzaTopping.HAM_AND_PINEAPPLE)
                .addTopping(PizzaTopping.SPICY_PORK).addTopping(PizzaTopping.PESTO).addTopping(PizzaTopping.HAM)
                .addTopping(PizzaTopping.BEEF).addTopping(PizzaTopping.TOMATO_AND_BASIL)
                .addTopping(PizzaTopping.SPINACH).addTopping(PizzaTopping.OLIVES).addTopping(PizzaTopping.CHICKEN)
                .build();
    }

    public Pizza prepareLargePizzaWithThreeToppings() {
        return this.setSize(PizzaSize.LARGE).addTopping(PizzaTopping.PEPPERS).addTopping(PizzaTopping.EXTRA_CHEESE)
                .addTopping(PizzaTopping.ONIONS).build();
    }

    public Pizza prepareLargePizzaWithSixToppings() {
        return this.setSize(PizzaSize.LARGE).addTopping(PizzaTopping.PEPPERS).addTopping(PizzaTopping.EXTRA_CHEESE)
                .addTopping(PizzaTopping.ONIONS).addTopping(PizzaTopping.BACON).addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.SAUSAGE).build();
    }

    public Pizza prepareLargePizzaWithNineToppings() {
        return this.setSize(PizzaSize.LARGE).addTopping(PizzaTopping.PEPPERS).addTopping(PizzaTopping.EXTRA_CHEESE)
                .addTopping(PizzaTopping.ONIONS).addTopping(PizzaTopping.BACON).addTopping(PizzaTopping.MUSHROOMS)
                .addTopping(PizzaTopping.SAUSAGE).addTopping(PizzaTopping.PEPPERONI)
                .addTopping(PizzaTopping.HAM_AND_PINEAPPLE).addTopping(PizzaTopping.SPICY_PORK).build();
    }
}
