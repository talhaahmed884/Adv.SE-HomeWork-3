package com.cpp.homeWork3.factory;

public class PaleoDietPlan extends DietPlan {
    private static DietPlan dietPlan;
    private final MacronutrientAbstractFactory macronutrientFactory;
    private final DietPlans mealPlan;

    private PaleoDietPlan() {
        macronutrientFactory = MacronutrientFactory.getInstance();
        mealPlan = DietPlans.PALEO;
    }

    public static DietPlan getInstance() {
        if (dietPlan == null)
            dietPlan = new PaleoDietPlan();
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

        return nutrientName.equals(CarbTypes.CHEESE.toString()) || nutrientName.equals(CarbTypes.BREAD.toString()) ||
                nutrientName.equals(CarbTypes.LENTILS.toString()) || nutrientName.equals(ProteinTypes.TOFU.toString())
                || nutrientName.equals(FatTypes.SOUR_CREAM.toString());
    }
}
