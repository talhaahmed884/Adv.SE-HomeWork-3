package com.cpp.homeWork3.factory;

public class VeganDietPlan extends DietPlan {
    private static DietPlan dietPlan;
    private final MacronutrientAbstractFactory macronutrientFactory;
    private final DietPlans mealPlan;

    private VeganDietPlan() {
        macronutrientFactory = MacronutrientFactory.getInstance();
        mealPlan = DietPlans.VEGAN;
    }

    public static DietPlan getInstance() {
        if (dietPlan == null)
            dietPlan = new VeganDietPlan();
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

        return nutrientName.equals(CarbTypes.CHEESE.toString()) || nutrientName.equals(FatTypes.SOUR_CREAM.toString())
                || nutrientName.equals(ProteinTypes.FISH.toString()) ||
                nutrientName.equals(ProteinTypes.CHICKEN.toString()) ||
                nutrientName.equals(ProteinTypes.BEEF.toString()) || nutrientName.equals(FatTypes.TUNA.toString());
    }
}
