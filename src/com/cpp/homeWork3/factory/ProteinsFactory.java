package com.cpp.homeWork3.factory;

import java.util.Random;

public class ProteinsFactory {
    private static ProteinsFactory proteinsFactory;

    private ProteinsFactory() {
    }

    public static ProteinsFactory getInstance() {
        if (proteinsFactory == null)
            proteinsFactory = new ProteinsFactory();
        return proteinsFactory;
    }

    public Nutrient getProteinsAtRandom(DietPlan dietPlan) {
        Nutrient nutrient = getProteinsAtRandom();
        while (dietPlan.declineNutrient(nutrient)) {
            nutrient = getProteinsAtRandom();
        }
        return nutrient;
    }

    private Nutrient getProteinsAtRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(ProteinsType.values().length);
        return switch (ProteinsType.values()[randomInt]) {
            case ProteinsType.FISH -> new Fish();
            case ProteinsType.CHICKEN -> new Chicken();
            case ProteinsType.BEEF -> new Beef();
            case ProteinsType.TOFU -> new Tofu();
        };
    }
}
