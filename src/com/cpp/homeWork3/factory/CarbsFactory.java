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
        int randomInt = random.nextInt(CarbsType.values().length);
        return switch (CarbsType.values()[randomInt]) {
            case CarbsType.CHEESE -> new Cheese();
            case CarbsType.BREAD -> new Bread();
            case CarbsType.LENTILS -> new Lentils();
            case CarbsType.PISTACHIO -> new Pistachio();
        };
    }
}
