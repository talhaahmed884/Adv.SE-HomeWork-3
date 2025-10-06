package com.cpp.homeWork3.factory;

public class NutAllergyDietPlan extends DietPlan {
    private static DietPlan dietPlan;
    private final MacronutrientAbstractFactory macronutrientFactory;
    private final DietPlans mealPlan;

    private NutAllergyDietPlan() {
        macronutrientFactory = MacronutrientFactory.getInstance();
        mealPlan = DietPlans.NUT_ALLERGY;
    }

    public static DietPlan getInstance() {
        if (dietPlan == null)
            dietPlan = new NutAllergyDietPlan();
        return dietPlan;
    }

    public DietPlans getMealPlan() {
        return this.mealPlan;
    }

    @Override
    public Meal prepareMeal() {
        Meal meal = new Meal(this.mealPlan);
        meal.addMeal(macronutrientFactory.getCarbsFactory().getCarbsAtRandom(this));
        meal.addMeal(macronutrientFactory.getProteinsFactory().getProteinsAtRandom(this));
        meal.addMeal(macronutrientFactory.getFatsFactory().getFatsAtRandom(this));
        return meal;
    }

    @Override
    public boolean declineNutrient(Nutrient nutrient) {
        String nutrientName = nutrient.toString();

        return nutrientName.equals(CarbTypes.PISTACHIO.toString()) || nutrientName.equals(FatTypes.PEANUTS.toString());
    }
}
