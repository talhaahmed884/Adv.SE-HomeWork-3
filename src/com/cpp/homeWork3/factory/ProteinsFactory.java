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
        int randomInt = random.nextInt(ProteinTypes.values().length);
        return switch (ProteinTypes.values()[randomInt]) {
            case ProteinTypes.FISH -> new Fish();
            case ProteinTypes.CHICKEN -> new Chicken();
            case ProteinTypes.BEEF -> new Beef();
            case ProteinTypes.TOFU -> new Tofu();
        };
    }
}
