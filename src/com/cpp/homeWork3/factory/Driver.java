package com.cpp.homeWork3.factory;

public class Driver {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", NoRestrictionDietPlan.getInstance());
        System.out.println(customer1);

        Customer customer2 = new Customer("Alice", NoRestrictionDietPlan.getInstance());
        System.out.println(customer2);

        Customer customer3 = new Customer("Alice", NutAllergyDietPlan.getInstance());
        System.out.println(customer3);

        Customer customer4 = new Customer("Alice", PaleoDietPlan.getInstance());
        System.out.println(customer4);

        Customer customer5 = new Customer("Alice", VeganDietPlan.getInstance());
        System.out.println(customer5);
    }
}
