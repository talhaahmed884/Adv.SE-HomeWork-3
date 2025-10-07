package com.cpp.homeWork3.factory;

public abstract class MacronutrientAbstractFactory {
    public abstract CarbsFactory getCarbsFactory();

    public abstract ProteinsFactory getProteinsFactory();

    public abstract FatsFactory getFatsFactory();
}
