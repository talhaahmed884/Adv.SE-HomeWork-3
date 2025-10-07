package com.cpp.homeWork3.factory;

public class Driver {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mark", NoRestrictionDietPlan.getInstance());
        System.out.println(customer1);

        Customer customer2 = new Customer("Robert", NoRestrictionDietPlan.getInstance());
        System.out.println(customer2);

        Customer customer3 = new Customer("Williams", NutAllergyDietPlan.getInstance());
        System.out.println(customer3);

        Customer customer4 = new Customer("Sophie", PaleoDietPlan.getInstance());
        System.out.println(customer4);

        Customer customer5 = new Customer("Sohan", VeganDietPlan.getInstance());
        System.out.println(customer5);

        Customer customer6 = new Customer("Tom", PaleoDietPlan.getInstance());
        System.out.println(customer6);
    }
}
