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
        int randomInt = random.nextInt(FatsType.values().length);
        return switch (FatsType.values()[randomInt]) {
            case FatsType.AVOCADO -> new Avocado();
            case FatsType.SOUR_CREAM -> new SourCream();
            case FatsType.TUNA -> new Tuna();
            case FatsType.PEANUTS -> new Peanuts();
        };
    }
}
