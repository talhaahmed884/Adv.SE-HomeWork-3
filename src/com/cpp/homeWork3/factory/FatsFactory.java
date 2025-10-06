package com.cpp.homeWork3.factory;

import java.util.Random;

public class FatsFactory {
    private static FatsFactory fatsFactory;

    private FatsFactory() {
    }

    public static FatsFactory getInstance() {
        if (fatsFactory == null)
            fatsFactory = new FatsFactory();
        return fatsFactory;
    }

    public Nutrient getFatsAtRandom(DietPlan dietPlan) {
        Nutrient nutrient = getFatsAtRandom();
        while (dietPlan.declineNutrient(nutrient)) {
            nutrient = getFatsAtRandom();
        }
        return nutrient;
    }

    private Nutrient getFatsAtRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(FatTypes.values().length);
        return switch (FatTypes.values()[randomInt]) {
            case FatTypes.AVOCADO -> new Avocado();
            case FatTypes.SOUR_CREAM -> new SourCream();
            case FatTypes.TUNA -> new Tuna();
            case FatTypes.PEANUTS -> new Peanuts();
        };
    }
}
