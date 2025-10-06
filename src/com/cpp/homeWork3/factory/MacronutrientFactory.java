package com.cpp.homeWork3.factory;

public class MacronutrientFactory extends MacronutrientAbstractFactory {
    private static MacronutrientFactory macronutrientFactory;

    private MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        if (macronutrientFactory == null)
            macronutrientFactory = new MacronutrientFactory();
        return macronutrientFactory;
    }

    @Override
    public CarbsFactory getCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    @Override
    public ProteinsFactory getProteinsFactory() {
        return ProteinsFactory.getInstance();
    }

    @Override
    public FatsFactory getFatsFactory() {
        return FatsFactory.getInstance();
    }
}
