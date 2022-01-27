package io.iamofoe.OOP.strategy_design.covid_example.breath;

public class LightBreathing implements Breathing{
    @Override
    public void breathingSymptoms() {
        System.out.println("Light and early stage of poor breathing.");
    }
}
