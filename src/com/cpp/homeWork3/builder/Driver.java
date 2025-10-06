package com.cpp.homeWork3.builder;

public class Driver {
    public static void main(String[] args) {
//        Part-1
        System.out.println("Part-1");
        PizzaHut pizzaHut = new PizzaHut();
        Pizza pizza1 = pizzaHut.prepareSmallPizzaWithThreeToppings();
        pizza1.eat();
        Pizza pizza2 = pizzaHut.prepareSmallPizzaWithSixToppings();
        pizza2.eat();
        Pizza pizza3 = pizzaHut.prepareSmallPizzaWithNineToppings();
        pizza3.eat();
        Pizza pizza4 = pizzaHut.prepareMediumPizzaWithThreeToppings();
        pizza4.eat();
        Pizza pizza5 = pizzaHut.prepareMediumPizzaWithSixToppings();
        pizza5.eat();
        Pizza pizza6 = pizzaHut.prepareMediumPizzaWithNineToppings();
        pizza6.eat();
        Pizza pizza7 = pizzaHut.prepareLargePizzaWithThreeToppings();
        pizza7.eat();
        Pizza pizza8 = pizzaHut.prepareLargePizzaWithSixToppings();
        pizza8.eat();
        Pizza pizza9 = pizzaHut.prepareLargePizzaWithNineToppings();
        pizza9.eat();

        System.out.println("Part-2");

//        Part-2
        Pizza pizza10 = pizzaHut.prepareLargePizzaWithThreeToppings();
        pizza10.eat();
        Pizza Pizza11 = pizzaHut.prepareSmallPizzaWithTwoToppings();
        Pizza11.eat();

        LittleCaesars littleCaesars = new LittleCaesars();
        Pizza pizza12 = littleCaesars.prepareMediumPizzaWithEightToppings();
        pizza12.eat();
        Pizza pizza13 = littleCaesars.prepareSmallPizzaWithSixToppings();
        pizza13.eat();

        Dominos dominos = new Dominos();
        Pizza pizza14 = dominos.prepareSmallPizzaWithOneTopping();
        pizza14.eat();
        Pizza pizza15 = dominos.prepareLargePizzaWithThreeToppings();
        pizza15.eat();
    }
}
