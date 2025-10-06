package com.cpp.homeWork3.factory;

import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory carbsFactory;

    private CarbsFactory() {
    }

    public static CarbsFactory getInstance() {
        if (carbsFactory == null)
            carbsFactory = new CarbsFactory();
        return carbsFactory;
    }

    public Nutrient getCarbsAtRandom(DietPlan dietPlan) {
        Nutrient nutrient = getCarbsAtRandom();
        while (dietPlan.declineNutrient(nutrient)) {
            nutrient = getCarbsAtRandom();
        }
        return nutrient;
    }

    private Nutrient getCarbsAtRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(CarbTypes.values().length);
        return switch (CarbTypes.values()[randomInt]) {
            case CarbTypes.CHEESE -> new Cheese();
            case CarbTypes.BREAD -> new Bread();
            case CarbTypes.LENTILS -> new Lentils();
            case CarbTypes.PISTACHIO -> new Pistachio();
        };
    }
}
